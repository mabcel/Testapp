package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Subjects")
public class Subjects {
	@Id
	private int suid;
	private String subname;
	private Integer sutid;
	public int getSuid() {
		return suid;
	}
	public void setSuid(int suid) {
		this.suid = suid;
	}
	public String getSubname() {
		return subname;
	}
	public void setSubname(String subname) {
		this.subname = subname;
	}
	public Integer getSutid() {
		return sutid;
	}
	public void setSutid(Integer sutid) {
		this.sutid = sutid;
	}
	@Override
	public String toString() {
		return "Subjects [suid=" + suid + ", subname=" + subname + ", sutid=" + sutid + "]";
	}

}


