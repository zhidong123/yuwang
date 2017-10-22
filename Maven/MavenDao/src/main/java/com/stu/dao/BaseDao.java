package com.stu.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

/**
 * 基础Dao
 * @author Administrator
 *
 */
@Repository
public class BaseDao {

	//声明SessionFactory
	@Resource
	private SessionFactory sf;

	//获取Session方法
	public Session getSession(){
		return sf.getCurrentSession();
	}
	
	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}
	
}
