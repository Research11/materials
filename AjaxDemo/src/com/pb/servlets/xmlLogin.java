package com.pb.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class xmlLogin extends HttpServlet {
		
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		PrintWriter out=response.getWriter();
		StringBuilder sb=new StringBuilder();
		sb.append("<userinfo>");
		sb.append("<username>");
		if(uname==null&&uname.length()==0){
			
			sb.append("«Î—°‘Ò”√ªß");
			
		}else{
			
			sb.append(uname);
			
		}		
		sb.append("</username>");
		sb.append("</userinfo>");
		
		out.println(sb.toString());
		out.flush();
		out.close();
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
