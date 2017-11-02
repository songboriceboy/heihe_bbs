package com.neuedu.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.bean.BbsTopicinfo;
import com.neuedu.bean.BbsUserinfo;
import com.neuedu.service.ITopicService;
import com.neuedu.service.TopicServiceImpl;

/**
 * Servlet implementation class SaveTopicServlet
 */
@WebServlet("/save_topic.do")
public class SaveTopicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SaveTopicServlet() {
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
		//获取表单信息
		request.setCharacterEncoding("utf-8");
		
		String strTitle = request.getParameter("title");
		String strContent = request.getParameter("content");
		String strClassID = request.getParameter("class");
		String strKissNum = request.getParameter("experience");
		//调用service层接口，将帖子保存到数据库
		BbsTopicinfo bti = new BbsTopicinfo();
		bti.setTitle(strTitle);
		bti.setContent(strContent);
		bti.setCategoryId(Integer.parseInt(strClassID));
		bti.setCreatetime(new Date());
		
		HttpSession hs = request.getSession();
		BbsUserinfo bui = (BbsUserinfo)hs.getAttribute("userinfo");
		bti.setUserid(bui.getId());
		
		ITopicService its = new TopicServiceImpl();
		its.addTopic(bti);
		
		//跳转到xx页面
	}

}
