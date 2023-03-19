package com.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Teachers")
public class Teachers {
   @Id
	private int tid;
	private String tname;
	private Integer tcid;
	@OneToMany
	@JoinColumn(name = "stid")
	private List<Subjects> listOfSub;
	@OneToMany
	@JoinColumn(name = "ctid")
	private List<Classes> listOfCls;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getTcid() {
		return tcid;
	}
	public void setTcid(Integer tcid) {
		this.tcid = tcid;
	}
	public List<Subjects> getListOfSub() {
		return listOfSub;
	}
	public void setListOfSub(List<Subjects> listOfSub) {
		this.listOfSub = listOfSub;
	}
	public List<Classes> getListOfCls() {
		return listOfCls;
	}
	public void setListOfCls(List<Classes> listOfCls) {
		this.listOfCls = listOfCls;
	}
	@Override
	public String toString() {
		return "Teachers [tid=" + tid + ", tname=" + tname + ", tcid=" + tcid + ", listOfSub=" + listOfSub
				+ ", listOfCls=" + listOfCls + "]";
	}

}
