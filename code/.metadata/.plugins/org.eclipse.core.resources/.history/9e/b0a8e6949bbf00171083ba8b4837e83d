package com.neuedu.dao;

import java.sql.Connection;

import com.mysql.jdbc.PreparedStatement;
import com.neuedu.bean.BbsTopicinfo;
import com.neuedu.util.DButil;

public class TopicDaoImpl implements ITopicDao{

	@Override
	public int addTopic(BbsTopicinfo bti) {
		// TODO Auto-generated method stub
		int ret = 0;
		Connection con =  null;
		PreparedStatement ps = null;
		try {
			con =  DButil.getInstance().getConnection();
			String strSql = "insert into tab_bbs_topicinfo(title,content"
					+ ",createtime,category_id,userid)"
					+ "values(?,?,?,?,?)";
			ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setString(1, bti.getTitle());
			ps.setString(2, bti.getContent());

			//java.sql.Date <-> java.util.Date
			long timeStamp = bti.getCreatetime().getTime();//java.util.Date
			java.sql.Date sqlDate = new java.sql.Date(timeStamp); 
			ps.setDate(3, sqlDate);
			
			ps.setInt(4, bti.getCategoryId());
			ps.setInt(5, bti.getUserid());

			
			ret = ps.executeUpdate();//³É¹¦·µ»Ø1
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DButil.getInstance().close(con);
		DButil.getInstance().close(ps);
		return ret;
	}

}
