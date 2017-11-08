package com.neuedu.dao;

import java.util.List;

import com.neuedu.bean.BbsTopicInfoEx;
import com.neuedu.bean.BbsTopicinfo;

public interface ITopicDao {

	int addTopic(BbsTopicinfo bti);
	List<BbsTopicInfoEx> getAllTopics();
	BbsTopicInfoEx getTopicByID(int id);
	
	int insertTopicViewCounts(int id);
	int getTotalCount();
	List<BbsTopicInfoEx> getPagedTopics(int pageSize, int pageIndex);
}
