package com.stu.servlet.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.stu.dao.IClassDao;
import com.stu.entity.TbClass;
import com.stu.servlet.IClassServlet;
@Repository("classServlet")
@Transactional(propagation=Propagation.REQUIRED)
public class ClassServletImpl implements IClassServlet {
	@Resource(name="classDao")
	private IClassDao classDao;

	@Override
	public boolean addClass(TbClass cls) {
		// TODO Auto-generated method stub
		classDao.addClass(cls);
		return true;
	}

	@Override
	public boolean updateClass(TbClass cls) {
		// TODO Auto-generated method stub
		classDao.updateClass(cls);
		return true;
	}

	@Override
	public List findClassList() {
		// TODO Auto-generated method stub
		return classDao.findClassList(" from TbClass c order by c.status desc ");
	}

	@Override
	public boolean deleteClass(TbClass cls) {
		// TODO Auto-generated method stub
		classDao.deleteClass(cls);
		return true;
	}

	@Override
	public TbClass findClassById(TbClass cls) {
		// TODO Auto-generated method stub
		return classDao.findClassById(cls);
	}

}
