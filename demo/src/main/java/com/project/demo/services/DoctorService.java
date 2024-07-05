package com.project.demo.services;

import java.util.List;

import com.project.demo.entity.Doctors;
import com.project.demo.entity.Patients;

public interface DoctorService {

	public List<Doctors> getAllDoctors();
	public Doctors addDoctor(Doctors doctor);
	public void removeDoctor(Long id);
	public List<Doctors> suggestDoctors(Patients patient);
}
