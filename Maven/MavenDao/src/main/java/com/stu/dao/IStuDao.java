package com.stu.dao;

import java.util.List;

import com.stu.entity.TbStu;

/**
 * 处理学生的相关信息接口
 * @author Administrator
 *
 */
public interface IStuDao {

	//添加学生
	public boolean addStu(TbStu stu);
	
	//删除学生
	public boolean deleteStu(TbStu stu);
	
	//修改学生
	public boolean updateStu(TbStu stu);
	
	//查询学生
	public List getStuList(String hql);

	//查询指定学生
	public TbStu findStuById(TbStu stu);
}
