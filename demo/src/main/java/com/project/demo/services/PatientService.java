package com.project.demo.services;

import java.util.List;

import com.project.demo.entity.Patients;

public interface PatientService {
	
	public List<Patients> getAllPatients();

	public Patients addPatient(Patients patient);

	public void removePatient(Long id);

	public Patients getPatientById(Long id);
}
