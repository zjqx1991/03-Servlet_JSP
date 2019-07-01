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
 * @Date Jul 1, 20195:28:20 PM
 */
@WebServlet("/redirect/s2")
public class RedirectTwoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1、接收请求参数
		//2、处理业务
		//3、跳转界面
		PrintWriter out = resp.getWriter();
		out.println("Servlet2.....before");
		System.out.println("Servlet2.....before");
	}

}
