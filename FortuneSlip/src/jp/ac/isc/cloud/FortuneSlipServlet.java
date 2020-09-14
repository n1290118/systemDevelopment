package jp.ac.isc.cloud;


import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

/**
 * Servlet implementation class FortuneSlipServlet
 */
@WebServlet("/fortuneslip")
public class FortuneSlipServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private FortuneSlip fs;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd =getServletContext().getRequestDispatcher("/WEB-INF/fortuneslip_get.jsp");
			rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("utf-8");
			String[] itemName = new String[4]; //大吉、中吉、末吉、凶の画像ファイル名を格納
			String name = request.getParameter("namae") ; //fortuneslip_get.jspのnamaeを取得
			fs = new FortuneSlip() ; //fortuneslipクラスのオブジェクト生成
			for(int i = 0;i < itemName.length;i++){
				itemName[i] = fs.getRandomItem() ; //大吉、中吉、末吉、凶の画像ファイル名を取得
			}
			request.setAttribute ("name", name); //JSP側でnameで値を取り出せるよう設定
			request.setAttribute ("itemName", itemName); //JSP側でitemNameで値を取り出せるよう設定
			RequestDispatcher rd =
				getServletContext().getRequestDispatcher("/WEB-INF/fortuneslip_post.jsp");
			rd.forward(request, response);
			}
		}