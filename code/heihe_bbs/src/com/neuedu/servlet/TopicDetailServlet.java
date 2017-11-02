package com.neuedu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neuedu.bean.BbsCommentEx;
import com.neuedu.bean.BbsTopicInfoEx;
import com.neuedu.service.CommentServiceImpl;
import com.neuedu.service.ICommentService;
import com.neuedu.service.ITopicService;
import com.neuedu.service.TopicServiceImpl;

/**
 * Servlet implementation class TopicDetailServlet
 */
@WebServlet("/topic_detail.do")
public class TopicDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TopicDetailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//��õ�ǰ������ϸ��Ϣ
		String id = request.getParameter("id");
		
		ITopicService its = new TopicServiceImpl();
		BbsTopicInfoEx btie = its.ViewTopicDetail(Integer.parseInt(id));
		
		//��õ�ǰ���ӵ�ȫ��������Ϣ
		//ת������������.jsp-- detail.jsp
		ICommentService ics = new CommentServiceImpl();
		List<BbsCommentEx> lst = ics.getAllCommentsByTopicID(Integer.parseInt(id));
		request.setAttribute("topic", btie);
		request.setAttribute("comments", lst);
		request.getRequestDispatcher("/jsp/detail.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
