package jp.ac.isc.cloud;

import java.io.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class AzureTestServlet
 */
@WebServlet("/azuretest")
public class AzureTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		response.getWriter().println("<html>");
		response.getWriter().println("<title>日付表示</title>");
		response.getWriter().println("<h1>今日は、");
		response.getWriter().println(Calendar.getInstance().getTime());
		//↑現在日付・時刻を出力
		response.getWriter().println("です。</h1></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
