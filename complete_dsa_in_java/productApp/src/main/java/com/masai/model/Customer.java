package com.masai.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

import lombok.Data;

//import org.apache.tomcat.jni.Address;

@Data
@Entity
@Table(name = "customers")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	private String customerName;
	
	@Column(unique = true)
	private String mobile;
	
	@Email(message =  "Email is not in 'example@email.com' format")
	@Column(unique = true)
	private String email;
	
	private String password;
	
//	@Embedded
//	private Address address;

}
