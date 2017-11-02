package com.neuedu.service;

import java.util.List;

import com.neuedu.bean.BbsComment;
import com.neuedu.bean.BbsCommentEx;

public interface ICommentService {
	int addComment(BbsComment bc);
	List<BbsCommentEx> getAllCommentsByTopicID(int id);
}
