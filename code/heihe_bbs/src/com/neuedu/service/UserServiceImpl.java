package com.neuedu.service;

import com.neuedu.bean.BbsUserinfo;
import com.neuedu.dao.IUserDao;
import com.neuedu.dao.UserDaoImpl;

public class UserServiceImpl implements IUserService{

	@Override
	public int addUser(BbsUserinfo bu) {
		// TODO Auto-generated method stub
		IUserDao iud = new UserDaoImpl();
		boolean bRet = iud.IsUserExist(bu.getEmail());
		if(bRet == true)//��ǰemail�Ѿ�����
		{
			return 0;//����ǰemail�Ѿ�����
		}
		else
		{
			return iud.addUser(bu);
		}
		
	}

	@Override
	public BbsUserinfo userLogin(String email, String pass) {
		// TODO Auto-generated method stub
		IUserDao iud = new UserDaoImpl();
		return iud.userLogin(email, pass);
	}

	@Override
	public boolean IsUserExist(String email) {
		// TODO Auto-generated method stub
		IUserDao iud = new UserDaoImpl();
		return iud.IsUserExist(email);
	}

}
