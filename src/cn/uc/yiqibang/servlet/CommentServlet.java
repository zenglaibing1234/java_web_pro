package cn.uc.yiqibang.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.print.attribute.standard.PrinterLocation;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CommentServlet")
public class CommentServlet extends BaseServlet{
	private static final long serialVersionUID = 1L;
	 
	//插入一条评论
	public void insertComment(HttpServletRequest request,HttpServletResponse response){
	
		String content=request.getParameter("content");
		System.out.println(""+content);
		PrintWriter out=request.getWriter();
		
	}
    
}
