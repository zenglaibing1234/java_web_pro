package cn.uc.yiqibang.servlet;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BaseServlet
 */
@WebServlet("/BaseServlet")
public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�������action����ȷ�û�����Ҫ����servlet����һ��������������
		String action=request.getParameter("action");
		if(action==null||"".equals(action)){
			//û�л�ȡ��action��˵���û������ʱ��û�����action����
			response.getWriter().println("��������Ƿ�������Я��action������ͼ!");
		}else{
			//��BaseServlet�������У��Ѿ���������صĲ�����������������Ҫ����action���е���
			//ʹ�÷�����ƣ���ȡ��action������Ȼ����þͿ�����
			
			try {
				//ʹ�õ�ǰ������.getMethod�������������ĳ������---param1Ϊ��������param2Ϊ�β�����
				Method method=this.getClass().getMethod(action, HttpServletRequest.class,HttpServletResponse.class);
				//��������--param1Ϊ���÷����Ķ���param2ʵ��
				method.invoke(this,request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				response.getWriter().println("���������ֵ����û�иò�����");
			}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
