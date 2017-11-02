package com.neuedu.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.bean.BbsUserinfo;
import com.neuedu.service.IUserService;
import com.neuedu.service.UserServiceImpl;
import com.neuedu.util.Md5Utils;
import com.sun.corba.se.spi.protocol.InitialServerRequestDispatcher;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String strEmail = request.getParameter("email");
		String strPwd = request.getParameter("pass");
		
		//调用service层接口，判断用户名密码是否正确
		IUserService ius = new UserServiceImpl();
		BbsUserinfo bui = ius.userLogin(strEmail, Md5Utils.md5(strPwd));
		if(bui!=null)
		{
			//重定向到网站首页（home.jsp)
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("userinfo", bui);
			response.sendRedirect(request.getContextPath() + "/jsp/home.jsp");
			//System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
	}

}
