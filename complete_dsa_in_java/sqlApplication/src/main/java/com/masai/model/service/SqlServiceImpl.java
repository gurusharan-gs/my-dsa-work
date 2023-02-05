package com.masai.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Msql;
import com.masai.model.dto.MsqlDto;
import com.masai.model.exception.MsqlException;
import com.masai.model.repository.MsqlDao;


@Service
public class SqlServiceImpl implements MsqlService{

	@Autowired
	private MsqlDao sDao;
	
	@Override
	public Msql addQuery(Msql sql) {
		Msql s = sDao.save(sql);
		return s;
	}

//	@Override
//	public List<String> findByNameLike(String name)throws MsqlException {
//		List<String> s = sDao.findByNameLike(name);
//		System.out.println(s);
//		if(s.size()== 0) {
//			throw new MsqlException("No found with ");
//		}else {
//			return s;
//		}
//	}

	@Override
	public List<MsqlDto> findByNameLike1(String name) throws MsqlException {
		List<MsqlDto> s = sDao.findByNameLike1(name);
		System.out.println(s);
		if(s.size()== 0) {
			throw new MsqlException("No found with ");
		}else {
			return s;
		}
	}

	@Override
	public List<Msql> getAll() {
		
		List<Msql> list = sDao.findAll();
		return list;
	}

}
