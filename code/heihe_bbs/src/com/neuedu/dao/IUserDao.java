package com.neuedu.dao;

import com.neuedu.bean.BbsUserinfo;

public interface IUserDao {
	int addUser(BbsUserinfo bu);
	int userLogin(String email, String pass);//����ֵ����0����¼�ɹ�
}