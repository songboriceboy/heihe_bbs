package com.neuedu.service;

import com.neuedu.bean.BbsUserinfo;

public interface IUserService {
	int addUser(BbsUserinfo bu);
	String userLogin(String email, String pass);//����ֵ����0����¼�ɹ�
}
