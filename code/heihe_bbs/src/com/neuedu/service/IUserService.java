package com.neuedu.service;

import com.neuedu.bean.BbsUserinfo;

public interface IUserService {
	int addUser(BbsUserinfo bu);
	BbsUserinfo userLogin(String email, String pass);//返回值大于0，登录成功
	
	boolean IsUserExist(String email);
	
	int SaveUserHeaderPicPath(String path,int id);
}
