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

/**
 * Servlet implementation class RegServlet
 */
@WebServlet("/reg.do")
public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegServlet() {
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
		String strNickName = request.getParameter("username");
		String strPwd = request.getParameter("pass");
		String strPwdAgain = request.getParameter("repass");
		
		//判断密码和确认密码是否一致
		
		//调用Service层接口，将用户添加到数据库
		IUserService ius = new UserServiceImpl();
		BbsUserinfo bu = new BbsUserinfo();
		bu.setEmail(strEmail);
		bu.setNickname(strNickName);
		bu.setPassword(Md5Utils.md5(strPwd));
		
		int nRet = ius.addUser(bu);
		if(nRet == 0)//当前用户已经存在
		{
			request.setAttribute("msg","email已存在");
			request.getRequestDispatcher("/jsp/reg.jsp").forward(request, response);
		}
		else
		{
			BbsUserinfo bui = ius.userLogin(strEmail, Md5Utils.md5(strPwd));
			HttpSession httpSession = request.getSession();
			httpSession.setAttribute("userinfo", bui);
			response.sendRedirect(request.getContextPath()+"/jsp/user_setting.jsp");
		}
		
		
	}

}
