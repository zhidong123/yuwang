package com.stu.servlet;

import java.util.List;

import com.stu.entity.TbStu;
/*
 * 学生操作的接口
 */
public interface IStuServlet {
	//添加学生
	public boolean addStu(TbStu stu);
	//删除学生
	public boolean deleteStu(TbStu stu);
	//修改学生
	public boolean updateStu(TbStu stu);
	//查询学生
	public List getStuList();
	//查询指定学生
	public TbStu findStuById(TbStu stu);

}
