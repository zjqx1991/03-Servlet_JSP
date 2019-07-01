/**
 * 
 */
package com.revanwang.redirect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Desc 	
 * @author Revan Wang
 *
 * @Date Jul 1, 20195:27:57 PM
 */
@WebServlet("/redirect/s1")
public class RedirectOntServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//1、接收请求参数
		//2、处理业务逻辑
		//3、跳转界面
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("Servlet1......before");
		System.out.println("Servlet1......before");
		
		//1、URL重定向（界面跳转）
		//resp.sendRedirect("/redirect/s2");
		
		//2、无法请求WEB-INF中的资源
		//resp.sendRedirect("/WEB-INF/inWEBINF.jsp");
		
		//3、请求项目中，WEB-INF之外的资源
		//resp.sendRedirect("/temp/out.jsp");
		
		//4、请求项目之外的资源
		resp.sendRedirect("https://home.firefoxchina.cn/");
		
		out.println("Servlet1......after");
		System.out.println("Servlet1......after");
		
	}

}
