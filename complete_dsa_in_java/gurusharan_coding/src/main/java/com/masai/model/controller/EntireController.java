package com.masai.model.controller;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.masai.model.Entire;
import com.masai.repository.EntireDao;

@RestController
public class EntireController {
	
	@Autowired
	private EntireDao eDoa;
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@PostMapping("/entire")
	public ResponseEntity<Entire> add(@RequestBody Entire entire) {

		Entire e = restTemplate.getForObject("https://api:publicapis.org", Entire.class);
		
		Entire newEd = new Entire();
		newEd.getId();
		newEd.getTitle();
		newEd.getDescription();
		newEd.getCategory();
		
		Entire saveD = eDoa.save(newEd);
		return new ResponseEntity<>(saveD, HttpStatus.OK);

	}
}
