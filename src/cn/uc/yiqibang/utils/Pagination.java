package cn.uc.yiqibang.utils;

import java.util.List;

public class Pagination {
	
	//����ÿҳ��ʾ���������
	//��ʼ��ѯ����������
	private int page;//ҳ��
	private int pageCount;//ÿҳ�������
	private List<Object> objs;
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getPageCount() {
		return pageCount;
	}
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	public List<Object> getObjs() {
		return objs;
	}
	public void setObjs(List<Object> objs) {
		this.objs = objs;
	}
	
	
}
