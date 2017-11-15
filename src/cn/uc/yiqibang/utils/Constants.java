package cn.uc.yiqibang.utils;



public class Constants {//Constants---����
	//��Ӧ��
	public static final int RETCODE_SUCCESS=0;
	public static final int RETCODE_FAILED=2000;
	
	//����ӳ���ļ�.xml�İ��ĸ�·��
	public static final String root="cn.uc.yiqibang.mapper";
	//����mapperӳ���ļ�������
	public static final String commentMapper=".TCommentMapper";
	public static final String newsMapper=".TNewsMapper";
	public static final String typeMapper=".TTypeMapper";
	public static final String picMapper=".TPicMapper";
	
	//���������sql����id����
	public static final String selectAll=".selectAll";
	public static final String selectByPrimaryKey=".selectByPrimaryKey";
	public static final String selectByLike=".selectByLike";
	public static final String insertSelective=".insertSelective";
	public static final String insert=".insert";
	public static final String update=".update";
	public static final String deleteByPrimaryKey=".deleteByPrimaryKey";
	public static final String deleteByCondition=".deleteByCodition";
	//..........
	
	//Comment���۵Ĳ������·��
	public static final String commentMapper_selectAll=root+commentMapper+selectAll;
	public static final String commentMapper_insert=root+commentMapper+insert;
	public static final String commentMapper_deleteByCondition=root+commentMapper+deleteByCondition;
	
//	public static final String commentMapper_deleteByCondition=root+commentMapper+deleteByCondition;
	
	//News���ŵĲ������·��
	public static final String newsMapper_selectByPrimaryKey=root+newsMapper+selectAll;
	public static final String newsMapper_deleteByPrimaryKey=root+newsMapper+deleteByPrimaryKey;
	public static final String newsMapper_insertSelective=root+newsMapper+insertSelective;
	public static final String newsMapper_selectByLike=root+newsMapper+selectByLike;
	public static final String newsMapper_selectAll=root+newsMapper+selectAll;
	
	//Type���ŷ���������·��
	public static final String typeMapper_selectByPrimaryKey=root+typeMapper+selectByPrimaryKey;
	public static final String typeMapper_selectAll=root+typeMapper+selectAll;
	
	//PicͼƬ
	public static final String picMapper_deleteByCondition=root+picMapper+deleteByCondition;
	public static final String picMapper_insertSelective=root+picMapper+insertSelective;
	
	
	
	

}
