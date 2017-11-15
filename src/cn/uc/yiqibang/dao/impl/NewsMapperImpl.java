package cn.uc.yiqibang.dao.impl;

import java.io.File;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.ibatis.session.SqlSession;

import com.mysql.jdbc.interceptors.SessionAssociationInterceptor;

import cn.uc.yiqibang.beans.TComment;
import cn.uc.yiqibang.beans.TNews;
import cn.uc.yiqibang.beans.TPic;
import cn.uc.yiqibang.dao.TCommentMapper;
import cn.uc.yiqibang.dao.TNewsMapper;
import cn.uc.yiqibang.dao.TPicMapper;
import cn.uc.yiqibang.utils.Constants;
import cn.uc.yiqibang.utils.MyBatisUtils;
import cn.uc.yiqibang.utils.Result;

public class NewsMapperImpl implements TNewsMapper{
	
	TPicMapper picDao=new PicMapperImpl();
	TCommentMapper commDao=new CommentMapperImpl();

	@Override
	public Result selectAll() {
		Result result=new Result();
		SqlSession session=MyBatisUtils.openSession();
		List<TNews> newsList=session.selectList(Constants.newsMapper_selectAll);
		session.close();
		if(newsList!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(newsList);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		return result;
	}

	@Override
	public Result deleteByPrimaryKey(Integer id) {
		Result result=new Result();
		result.setRetCode(Constants.RETCODE_FAILED);
		result.setRetMsg(false);
		
		//ɾ����id����������ͼƬ
		TPic pic=new TPic();
		pic.setT_n_id(id);
		picDao.deleteByCondition(pic);
		
		//ɾ����id��������������
		TComment comm=new TComment();
		comm.setT_n_id(id);
		commDao.deleteByCondition(comm);
		
		//ɾ������
		SqlSession session=MyBatisUtils.openSession();
		int row=session.delete(Constants.newsMapper_deleteByPrimaryKey,id);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		return result;
	}

	@Override
	public Result insertNewsPic(HttpServletRequest request) {
		Result result=new Result();
		result.setRetCode(Constants.RETCODE_FAILED);
		result.setRetMsg(false);
		
		//�������̹���
		DiskFileItemFactory factory=new DiskFileItemFactory();
		factory.setRepository(new File("d:/"));
		factory.setSizeThreshold(100*1024*1024);
		
		//�����ļ��ϴ����߶���
		ServletFileUpload upload=new ServletFileUpload(factory);
		upload.setFileSizeMax(-1);//�ϴ��ĵ����ļ��Ĵ�С��-1��ʾ������
		upload.setHeaderEncoding("UTF-8");
		upload.setSizeMax(50*1024*1024);
		
		try {
			List<FileItem> files=upload.parseRequest(request);
			Iterator<FileItem> itFile=files.iterator();
			while(itFile.hasNext()){
				FileItem file=itFile.next();
				if(!file.isFormField()){
					String picName=file.getName();
					
					//��ͼƬ������ƴ��Ϊ��ǰʱ��ĺ���������.��׺
					String suffix=picName.substring(picName.lastIndexOf("."));
					long currTime=System.currentTimeMillis();
					String imgName=currTime+suffix;
					
					String imgPath=request.getServletContext().getRealPath("new_imgs");
					File filePath=new File(imgPath);
					if(!filePath.exists()){
						 filePath.mkdirs();
					}
					String picPath=imgPath+File.separator+imgName;
					file.write(new File(picPath));
					
					TPic pic=new TPic();
					pic.setP_path(imgName);
					result=picDao.insertSelective(pic);
					if(result.isRetMsg()){
						result.setRetData(imgName);
					}
				}
			}
		} catch (FileUploadException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Result selectByLike(String likeStr) {
		Result result=new Result();
		result.setRetCode(Constants.RETCODE_FAILED);
		result.setRetMsg(false);
		//�������
		SqlSession session=MyBatisUtils.openSession();
		List<TNews> news=session.selectList(Constants.newsMapper_selectByLike,likeStr);
		session.close();
		if(news!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(news);
		}
		return result;
	}

	@Override
	public int insert(TNews record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Result insertSelective(TNews record) {
		Result result=new Result();
		result.setRetCode(Constants.RETCODE_FAILED);
		result.setRetMsg(false);
		
		//�������
		SqlSession session=MyBatisUtils.openSession();
		int row=session.insert(Constants.newsMapper_insertSelective,record);
		session.commit();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(false);
			
		}
		return result;
	}

	@Override
	public TNews selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TNews record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(TNews record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TNews record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
