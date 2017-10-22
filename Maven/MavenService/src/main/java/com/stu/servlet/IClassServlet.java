package com.stu.servlet;

import java.util.List;

import com.stu.entity.TbClass;

public interface IClassServlet {

	//添加班级
	public boolean addClass(TbClass cls);

	//新改班级
	public boolean updateClass(TbClass cls);
	
	//删除班级
	public boolean deleteClass(TbClass cls);
		
	//查询班级
	public List findClassList();

	//根据Id差班级
	public TbClass findClassById(TbClass cls);
}
