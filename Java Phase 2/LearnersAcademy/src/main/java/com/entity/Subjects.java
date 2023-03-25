package com.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;


@Entity
@Table(name="Subjects")
public class Subjects {
	@Id
	private int suid;
	private String subname;
	@ManyToOne
	private Classes clss;
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
	@Override
	public String toString() {
		return "Subjects [suid=" + suid + ", subname=" + subname + "]";
	}

}


