package com.neuedu.dao;

import java.util.List;

import com.neuedu.bean.BbsTopicInfoEx;
import com.neuedu.bean.BbsTopicinfo;

public interface ITopicDao {

	int addTopic(BbsTopicinfo bti);
	List<BbsTopicInfoEx> getAllTopics();
}
