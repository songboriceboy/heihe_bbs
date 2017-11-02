package com.neuedu.service;

import java.util.List;

import com.neuedu.bean.BbsTopicInfoEx;
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

	@Override
	public List<BbsTopicInfoEx> getAllTopics() {
		// TODO Auto-generated method stub
		ITopicDao itd = new TopicDaoImpl();
		return itd.getAllTopics();
	}

}
