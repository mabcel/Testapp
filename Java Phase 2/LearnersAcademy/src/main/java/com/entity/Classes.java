package com.entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="Classes")
public class Classes {
    @Id
    //@GeneratedValue
	private int cid;
	private String cname;
	@OneToMany
	private List<Students> listOfStd;
	@OneToMany (mappedBy = "clss")
	//@JoinColumn(name = "")
	private List<Subjects> listOfSbj;
	@OneToMany
	private List<Teachers> listOfTeach;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Students> getListOfStd() {
		return listOfStd;
	}
	public void setListOfStd(List<Students> listOfStd) {
		this.listOfStd = listOfStd;
	}
	public List<Subjects> getListOfSbj() {
		return listOfSbj;
	}
	public void setListOfSbj(List<Subjects> listOfSbj) {
		this.listOfSbj = listOfSbj;
	}
	public List<Teachers> getListOfTeach() {
		return listOfTeach;
	}
	public void setListOfTeach(List<Teachers> listOfTeach) {
		this.listOfTeach = listOfTeach;
	}
	@Override
	public String toString() {
		return "Classes [cid=" + cid + ", cname=" + cname + ", listOfStd=" + listOfStd
				+ ", listOfSbj=" + listOfSbj + ", listOfTeach=" + listOfTeach + "]";
	}
}

