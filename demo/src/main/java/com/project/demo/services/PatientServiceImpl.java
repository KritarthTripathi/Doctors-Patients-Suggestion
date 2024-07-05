package com.project.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.demo.entity.Patients;
import com.project.demo.repo.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{

	@Autowired
    private PatientRepository patientRepository;
	
	@Override
	public List<Patients> getAllPatients() {
		return patientRepository.findAll();
	}

    public Patients addPatient(Patients patient) {
        return patientRepository.save(patient);
    }


	public void removePatient(Long id) {
        patientRepository.deleteById(id);
    }

	public Patients getPatientById(Long id) {
        return patientRepository.findById(id).orElse(null);
    }

	
	
}
