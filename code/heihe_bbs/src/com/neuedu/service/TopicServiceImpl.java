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

	@Override
	public BbsTopicInfoEx ViewTopicDetail(int id) {
		// TODO Auto-generated method stub
		ITopicDao itd = new TopicDaoImpl();
		
		//增加帖子的阅读数
		itd.insertTopicViewCounts(id);
		return itd.getTopicByID(id);
	}

	@Override
	public List<BbsTopicInfoEx> getPagedTopics(int pageSize, int pageIndex) {
		// TODO Auto-generated method stub
		ITopicDao itd = new TopicDaoImpl();
		return itd.getPagedTopics(pageSize, pageIndex);
	}

	@Override
	public int getTotalCount() {
		// TODO Auto-generated method stub
		ITopicDao itd = new TopicDaoImpl();
		return itd.getTotalCount();
	}

}
