/**
 * 
 */
package com.revanwang.forward;

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
 * @Date Jul 1, 20194:43:55 PM
 */
@WebServlet("/forward/s2")
public class ForwardTwoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1、接收参数
		//2、处理业务请求
		//3、跳转界面
		PrintWriter out = resp.getWriter();
		out.println("Servlet2.......");
		System.out.println("Servlet2.......");
	}

}
