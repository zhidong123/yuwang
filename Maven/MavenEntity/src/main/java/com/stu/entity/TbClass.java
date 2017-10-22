package com.stu.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 封装班级信息的实体类
 * @author Administrator
 *
 */
@Entity
@Table(name="TbClass_10_19")
public class TbClass implements Serializable {

	private int cno;		//班级编号
	private String cname;	//班级名称
	private Date createtime;//班级创建时间
	private int status = 1;	//班级状态1为注册0为注销
	
	public TbClass() {
		super();
	}

	public TbClass(int cno, String cname, Date createtime, int status) {
		this.cno = cno;
		this.cname = cname;
		this.createtime = createtime;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getCno() {
		return cno;
	}

	public void setCno(int cno) {
		this.cno = cno;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}
	
}
