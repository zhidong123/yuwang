package com.stu.dao;

import java.util.List;

import com.stu.entity.TbClass;

/**
 * 定义班级相关操作的功能接口
 * @author Administrator
 *
 */
public interface IClassDao {

	//添加班级
	public boolean addClass(TbClass cls);

	//新改班级
	public boolean updateClass(TbClass cls);
	
	//新改班级
	public boolean deleteClass(TbClass cls);
		
	//查询班级
	public List findClassList(String hql);
	
	//根据Id差班级
	public TbClass findClassById(TbClass cls);
	
}
