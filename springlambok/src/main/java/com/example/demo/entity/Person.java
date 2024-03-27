package com.example.demo.entity;

import java.sql.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;
import java.util.*;

@Entity
@SequenceGenerator(name = "generator2", sequenceName = "gen2", initialValue = 5000)
@Data
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "generator2")
	private int perId;
	
	@NotEmpty
	@Size(min=3,message="person name should create atleast 3character")
	private String perName;
	
	//@NotBlank(message="age should not blank")
	@NotNull
	@Min(18)
	private int perAge;
	
	@Column(name="email-id",unique=true,length=30)
	@NotEmpty
	@Email(message="Email is not valid")
	private String perEmail;
	
	@Column(name="password",length=20)
	@NotEmpty
	@Size(min=8,message="password length must be 8 characters and upparcase,lowercase,digit")
	@Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	public String perPassword;
	
	@Column(name="phone_number")
	@NotEmpty
	@Pattern(regexp="^[6-9][0-9]{9}$")
	private String perPhone;
	
	@JsonFormat(pattern = "dd-mm-yyyy")
    private Date perDate;
}