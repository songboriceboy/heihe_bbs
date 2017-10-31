package com.neuedu.dao;



import java.sql.Connection;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;
import com.neuedu.bean.BbsUserinfo;
import com.neuedu.util.DButil;

public class UserDaoImpl implements IUserDao{

	@Override
	public int addUser(BbsUserinfo bu) {
		// TODO Auto-generated method stub
		int ret = 0;
		try {
			Connection con =  DButil.getInstance().getConnection();
			String strSql = "insert into tab_bbs_userinfo(email,nickname,password)"
					+ "values(?,?,?)";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setString(1, bu.getEmail());
			ps.setString(2, bu.getNickname());
			ps.setString(3, bu.getPassword());
			
			ret = ps.executeUpdate();//³É¹¦·µ»Ø1
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
	}

	@Override
	public int userLogin(String email, String pass) {
		// TODO Auto-generated method stub
		int ret = 0;
		try {
			Connection con =  DButil.getInstance().getConnection();
			String strSql = "select count(*) as count from tab_bbs_userinfo "
					+ "where email = ? and password = ?";
			PreparedStatement ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setString(1, email);
			ps.setString(2, pass);
		
			
			ResultSet rs = ps.executeQuery();
			if(rs.next())
			{
				ret = rs.getInt("count");
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ret;
	}

}
