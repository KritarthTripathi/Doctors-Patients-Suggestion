package com.project.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.project.demo.entity.Doctors;
import com.project.demo.entity.Patients;
import com.project.demo.services.DoctorService;
import com.project.demo.services.PatientService;

@RestController
@RequestMapping("/api")
public class PDController {
    @Autowired
    private PatientService patientService;
    @Autowired
    private DoctorService doctorService;

    @GetMapping("/allpatients")
    public List<Patients> getAllPatients() {
        return patientService.getAllPatients();
    }

    @GetMapping("/alldoctors")
    public List<Doctors> getAllDoctors() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("{patientId}/suggest-doctors")
    public List<Doctors> suggestDoctors(@PathVariable Long patientId) {
        Patients patient = patientService.getPatientById(patientId);

        if (patient == null) {
            throw new RuntimeException("Patient not found");
        }

        return doctorService.suggestDoctors(patient);
    }
    @PostMapping("/patients")
    public Patients addPatient(@RequestBody Patients patient) {
        return patientService.addPatient(patient);
    }

    @DeleteMapping("/patients/{id}")
    public void removePatient(@PathVariable Long id) {
        patientService.removePatient(id);
    }
}
