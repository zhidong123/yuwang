package com.stu.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="TbStu_10_19")
public class TbStu implements Serializable{

	private int sno;		//编号
	private String sname;	//姓名
	private int sage;		//年龄
	private int ssex;		//性别 1:男 0:女
	private Date sintime;	//入学时间
	
	private TbClass cls;	//多对一（多个学生对应一个班级）

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public int getSage() {
		return sage;
	}

	public void setSage(int sage) {
		this.sage = sage;
	}

	public int getSsex() {
		return ssex;
	}

	public void setSsex(int ssex) {
		this.ssex = ssex;
	}

	public Date getSintime() {
		return sintime;
	}

	public void setSintime(Date sintime) {
		this.sintime = sintime;
	}

	@ManyToOne(cascade=CascadeType.REFRESH,fetch=FetchType.EAGER)
	@JoinColumn(name="scno")
	public TbClass getCls() {
		return cls;
	}

	public void setCls(TbClass cls) {
		this.cls = cls;
	}
	
	
	

}
