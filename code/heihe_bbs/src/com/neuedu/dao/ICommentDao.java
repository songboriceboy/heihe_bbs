package com.neuedu.dao;

import java.util.List;

import com.neuedu.bean.BbsComment;
import com.neuedu.bean.BbsCommentEx;

public interface ICommentDao {
	int addComment(BbsComment bc);
	List<BbsCommentEx> getAllCommentsByTopicID(int id);
}
