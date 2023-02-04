package com.masai.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Msql;
import com.masai.model.service.MsqlService;


@RestController
public class SqlController {
	
	@Autowired
	private MsqlService sService;

	@PostMapping("/query/add")
	public ResponseEntity<Msql> addQuery(@RequestBody Msql sql) {
		return new ResponseEntity<Msql>(sService.addQuery(sql), HttpStatus.CREATED);
	}
	
	@GetMapping("/query/{name}")
	public ResponseEntity<List<String>> getQueryByName(@PathVariable("name") String name) {
		return new ResponseEntity<List<String>>(sService.findByNameLike(name), HttpStatus.CREATED);	
	}
}
