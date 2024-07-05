package com.project.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.entity.Doctors;
import com.project.demo.entity.Doctors.City;
import com.project.demo.entity.Doctors.Speciality;

public interface DoctorRepository extends JpaRepository<Doctors, Long> {
    List<Doctors> findByCityAndSpeciality (City city, Speciality speciality);
}


