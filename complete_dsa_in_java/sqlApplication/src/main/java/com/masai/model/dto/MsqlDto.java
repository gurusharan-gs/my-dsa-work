package com.masai.model.dto;

public class MsqlDto {
	private String name;
	private String query;
	


	public MsqlDto(String name, String query) {
		super();
		this.name = name;
		this.query = query;
	}

	public MsqlDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}




	
	

}
