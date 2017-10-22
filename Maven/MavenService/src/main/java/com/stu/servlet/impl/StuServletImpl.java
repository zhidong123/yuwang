package com.stu.servlet.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stu.dao.IStuDao;
import com.stu.entity.TbStu;
import com.stu.servlet.IStuServlet;
@Service("stuService")
@Transactional(propagation=Propagation.REQUIRED)
public class StuServletImpl implements IStuServlet {

	@Resource(name="stuDao")
	private IStuDao stuDao;
	@Override
	public boolean addStu(TbStu stu) {
		// TODO Auto-generated method stub
		stuDao.addStu(stu);
		return true;
	}

	@Override
	public boolean deleteStu(TbStu stu) {
		// TODO Auto-generated method stub
		stuDao.deleteStu(stu);
		return true;
	}

	@Override
	public boolean updateStu(TbStu stu) {
		// TODO Auto-generated method stub
		stuDao.updateStu(stu);
		return true;
	}

	@Override
	public List getStuList() {
		// TODO Auto-generated method stub
		return stuDao.getStuList(" from TbStu ");
	}

	@Override
	public TbStu findStuById(TbStu stu) {
		// TODO Auto-generated method stub
		return stuDao.findStuById(stu);
	}

}
