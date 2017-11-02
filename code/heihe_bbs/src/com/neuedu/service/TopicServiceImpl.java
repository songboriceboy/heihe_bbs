package com.neuedu.service;

import com.neuedu.bean.BbsTopicinfo;
import com.neuedu.dao.ITopicDao;
import com.neuedu.dao.TopicDaoImpl;

public class TopicServiceImpl implements ITopicService {

	@Override
	public int addTopic(BbsTopicinfo bti) {
		// TODO Auto-generated method stub
		ITopicDao itd = new TopicDaoImpl();
		return itd.addTopic(bti);
	}

}
