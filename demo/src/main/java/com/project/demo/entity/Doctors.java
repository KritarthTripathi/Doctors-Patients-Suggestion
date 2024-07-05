package com.project.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name="DoctorsList")
public class Doctors {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	
	
	@NotBlank
	@Size(min = 3)
	private String Name;
	
	@Enumerated(EnumType.STRING)
    private City city;

    @Email
    private String email;

    @Pattern(regexp = "\\d{10,}")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Speciality speciality;
	
	
	public Doctors(Long iD, String name, City city, Speciality speciality, String phone_number, String email) {
		super();
		ID = iD;
		Name = name;
		this.city = city;
		this.speciality = speciality;
		this.phoneNumber = phone_number;
		this.email = email;
	}
	
	public enum City {
	    DELHI, NOIDA, FARIDABAD
	}

	public enum Speciality {
	    ORTHOPAEDIC, GYNECOLOGY, DERMATOLOGY, ENT
	}
	
	
	public Doctors() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//Getters and Setters
	public Long getID() {
		return ID;
	}


	public void setID(Long iD) {
		ID = iD;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public City getCity() {
		return city;
	}


	public void setCity(City city) {
		this.city = city;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public Speciality getSpeciality() {
		return speciality;
	}


	public void setSpeciality(Speciality speciality) {
		this.speciality = speciality;
	}


	
	
	
	
	

}


