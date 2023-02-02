package com.masai.model;

import java.util.List;

public class Date {
	
	private int count ;
	private List<Entire> ent;
	
	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date(int count, List<Entire> ent) {
		super();
		this.count = count;
		this.ent = ent;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public List<Entire> getEnt() {
		return ent;
	}

	public void setEnt(List<Entire> ent) {
		this.ent = ent;
	}
	
	

}
