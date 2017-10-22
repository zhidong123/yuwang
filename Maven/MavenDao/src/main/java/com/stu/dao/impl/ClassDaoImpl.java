package com.stu.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stu.dao.BaseDao;
import com.stu.dao.IClassDao;
import com.stu.entity.TbClass;
@Repository("classDao")
public class ClassDaoImpl extends BaseDao implements IClassDao {

	@Override
	public boolean addClass(TbClass cls) {
		// TODO Auto-generated method stub
		try {
			getSession().save(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public boolean updateClass(TbClass cls) {
		// TODO Auto-generated method stub
		try {
			getSession().update(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public List findClassList(String hql) {
		// TODO Auto-generated method stub
		return getSession().createQuery(hql).list();
	}

	@Override
	public boolean deleteClass(TbClass cls) {
		// TODO Auto-generated method stub
		try {
			getSession().delete(cls);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public TbClass findClassById(TbClass cls) {
		// TODO Auto-generated method stub
		return getSession().get(TbClass.class, cls.getCno());
	}

}
