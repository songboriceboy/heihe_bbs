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
		Connection con =  null;
		PreparedStatement ps = null;
		try {
			con =  DButil.getInstance().getConnection();
			String strSql = "insert into tab_bbs_userinfo(email,nickname,password)"
					+ "values(?,?,?)";
			ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setString(1, bu.getEmail());
			ps.setString(2, bu.getNickname());
			ps.setString(3, bu.getPassword());
			
			ret = ps.executeUpdate();//成功返回1
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DButil.getInstance().close(con);
		DButil.getInstance().close(ps);
		return ret;
	}

	@Override
	public BbsUserinfo userLogin(String email, String pass) {
		// TODO Auto-generated method stub
		
		Connection con =  null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		BbsUserinfo bui = null;
		try {
			con =  DButil.getInstance().getConnection();
			String strSql = "select id, nickname from tab_bbs_userinfo "
					+ "where email = ? and password = ?";
			ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setString(1, email);
			ps.setString(2, pass);
		
			
			rs = ps.executeQuery();
			if(rs.next())
			{
				String nickname = rs.getString("nickname");
				int id = rs.getInt("id");
				bui = new BbsUserinfo();
				bui.setNickname(nickname);
				bui.setId(id);
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DButil.getInstance().close(con);
		DButil.getInstance().close(ps);
		DButil.getInstance().close(rs);
		return bui;
	}

	@Override
	public boolean IsUserExist(String email) {
		// TODO Auto-generated method stub
		Connection con =  null;
		PreparedStatement ps = null;
		ResultSet rs = null;
	
		
		boolean bRet = false;
		try {
			con =  DButil.getInstance().getConnection();
			String strSql = "select * from tab_bbs_userinfo "
					+ "where email = ?";
			ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setString(1, email);
		
		
			
			rs = ps.executeQuery();
			bRet = rs.next();

		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DButil.getInstance().close(con);
		DButil.getInstance().close(ps);
		DButil.getInstance().close(rs);
		return bRet;
	}

	@Override
	public int SaveUserHeaderPicPath(String path,int id) {
		// TODO Auto-generated method stub
		int ret = 0;
		Connection con =  null;
		PreparedStatement ps = null;
		try {
			con =  DButil.getInstance().getConnection();
			String strSql = "update tab_bbs_userinfo set head_url = ? where id = ?";
			ps = (PreparedStatement) con.prepareStatement(strSql);
			ps.setString(1, path);
			ps.setInt(2, id);

			
			ret = ps.executeUpdate();//成功返回1
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		DButil.getInstance().close(con);
		DButil.getInstance().close(ps);
		return ret;
	}

}
