package com.neuedu.service;

import java.util.List;

import com.neuedu.bean.BbsTopicInfoEx;
import com.neuedu.bean.BbsTopicinfo;

public interface ITopicService {
	int addTopic(BbsTopicinfo bti);
	List<BbsTopicInfoEx> getAllTopics();
	BbsTopicInfoEx ViewTopicDetail(int id);
}
