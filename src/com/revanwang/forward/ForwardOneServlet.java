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
 * @Date Jul 1, 20194:42:59 PM
 */
@WebServlet("/forward/s1")
public class ForwardOneServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//1、接收请求参数
		//2、处理业务
		//3、跳转界面
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter out = resp.getWriter();
		out.println("Servlet1...before");
		System.out.println("Servlet1...before");
		//1、跳转
		//req.getRequestDispatcher("/forward/s2").forward(req, resp);
		
		//2、访问WEB-INF中资源（只有forward方式可以访问WEB-INF中的资源）
		//req.getRequestDispatcher("/WEB-INF/inWEBINF.jsp").forward(req, resp);
		
		//3、访问WEB-INF之外的资源
		req.getRequestDispatcher("/temp/out.jsp").forward(req, resp);
		
		//4、请求外部资源（forward方式无法请求外部资源）
		//req.getRequestDispatcher("/https://home.firefoxchina.cn/").forward(req, resp);
		
		out.println("Servlet1...after");
		System.out.print("Servlet...after");
	}

}
