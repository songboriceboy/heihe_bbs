package com.neuedu.servlet;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.neuedu.bean.BbsComment;
import com.neuedu.bean.BbsUserinfo;
import com.neuedu.service.CommentServiceImpl;
import com.neuedu.service.ICommentService;

/**
 * Servlet implementation class SummitCommentServlet
 */
@WebServlet("/submit_comment.do")
public class SubmitCommentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmitCommentServlet() {
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
		//获得表单信息
		request.setCharacterEncoding("utf-8");
		String content = request.getParameter("content");
		String tid = request.getParameter("topic_id");
		
		HttpSession hsHttpSession = request.getSession();
		BbsUserinfo bui = (BbsUserinfo)hsHttpSession.getAttribute("userinfo");
		//调用service接口，保存留言
		
		BbsComment bc = new BbsComment();
		bc.setTopicOrCommentId(Integer.parseInt(tid));
		bc.setIsTopic(0);
		bc.setContent(content);
		bc.setCommentTime(new Date());
		bc.setUserid(bui.getId());
		
		
		ICommentService ics = new CommentServiceImpl();
		ics.addComment(bc);
		//重定向到topic_detail.do
		
		response.sendRedirect(request.getContextPath() + "/topic_detail.do?id="+tid);
	}

}
