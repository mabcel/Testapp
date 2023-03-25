package com.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Students")
public class Students {
	@Id
	//@GeneratedValue
	private int stid;
	private String stname;
	//@ManyToOne
	//@JoinColumn(name = "")
	@OneToOne
	private Classes cls;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public Classes getCls() {
		return cls;
	}
	public void setCls(Classes cls) {
		this.cls = cls;
	}
	@Override
	public String toString() {
		return "Students [stid=" + stid + ", stname=" + stname + ", cls=" + cls + "]";
	}

}
