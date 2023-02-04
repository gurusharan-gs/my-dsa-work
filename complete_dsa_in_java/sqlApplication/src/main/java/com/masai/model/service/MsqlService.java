package com.masai.model.service;

import java.util.List;

import com.masai.model.Msql;
import com.masai.model.exception.MsqlException;



public interface MsqlService {

	public Msql addQuery(Msql sql);
	public List<String> findByNameLike(String name)throws MsqlException;

}
