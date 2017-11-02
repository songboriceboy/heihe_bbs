package com.neuedu.dao;

import com.neuedu.bean.BbsUserinfo;

public interface IUserDao {
	int addUser(BbsUserinfo bu);
	BbsUserinfo userLogin(String email, String pass);//返回值大于0，登录成功
	
}
