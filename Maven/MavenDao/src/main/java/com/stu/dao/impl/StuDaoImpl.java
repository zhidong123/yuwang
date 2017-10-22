package com.stu.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stu.dao.BaseDao;
import com.stu.dao.IStuDao;
import com.stu.entity.TbStu;
/*
 * 实现处理学生相关操作的实现类
 */
@Repository("stuDao")
public class StuDaoImpl extends BaseDao implements IStuDao {

	@Override
	public boolean addStu(TbStu stu) {			//添加学生
		try {
			getSession().save(stu);				//实现学生持久化操作
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean deleteStu(TbStu stu) {		//删除学生
		try {
			getSession().delete(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateStu(TbStu stu) {		//修改学生
		try {
			getSession().update(stu);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List getStuList(String hql) {		//查询学生
		// TODO Auto-generated method stub
		return getSession().createQuery(hql).list();
	}

	@Override
	public TbStu findStuById(TbStu stu) {
		// TODO Auto-generated method stub
		return getSession().get(TbStu.class, stu.getSno());
	}

}
