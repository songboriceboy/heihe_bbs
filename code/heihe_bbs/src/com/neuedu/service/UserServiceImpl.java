package com.neuedu.service;

import com.neuedu.bean.BbsUserinfo;
import com.neuedu.dao.IUserDao;
import com.neuedu.dao.UserDaoImpl;

public class UserServiceImpl implements IUserService{

	@Override
	public int addUser(BbsUserinfo bu) {
		// TODO Auto-generated method stub
		IUserDao iud = new UserDaoImpl();
		
		return iud.addUser(bu);
	}

}
