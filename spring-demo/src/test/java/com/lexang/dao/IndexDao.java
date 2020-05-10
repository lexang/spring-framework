package com.lexang.dao;

import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
public class IndexDao {

	public IndexDao() {
		System.out.println("构造方法");
	}

	@PostConstruct
	public void init(){
		System.out.println("init 方法 ");
	}

	public void query(){
		System.out.println("query");
	}
}
