package com.neuedu.bean;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class testJava2Json {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BbsCategory bbsCategory = new  BbsCategory();
		bbsCategory.setId(33);
		bbsCategory.setNickname("java");
		
		BbsCategory bbsCategory2 = new  BbsCategory();
		bbsCategory2.setId(35);
		bbsCategory2.setNickname("php");
		
		List<BbsCategory> lst = new ArrayList<BbsCategory>();
		lst.add(bbsCategory);
		lst.add(bbsCategory2);
		
		String strJson = JSON.toJSONString(lst);
		System.out.println(strJson);
	}

}
