package com.project.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.demo.entity.Doctors;
import com.project.demo.services.*;

@RestController
public class DPController {
	
	@Autowired
	public DoctorService doctorService;
		
	@PostMapping("/doctors")
    public Doctors addDoctor(@RequestBody Doctors doctor) {
        return doctorService.addDoctor(doctor);
    }

    @DeleteMapping("/doctors/{id}")
    public void removeDoctor(@PathVariable Long id) {
        doctorService.removeDoctor(id);
    }
	
}
