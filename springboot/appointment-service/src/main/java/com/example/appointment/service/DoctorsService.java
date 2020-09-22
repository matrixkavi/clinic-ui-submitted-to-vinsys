package com.example.appointment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.appointment.bean.Doctor;
import com.example.appointment.repository.DoctorsRepository;

@Service
public class DoctorsService {

	@Autowired
	public DoctorsRepository repo;
	
	public List<Doctor> getDoctorsWithSpecialization(String specialization){
		List<Doctor> doctors = repo.findBySpecialization(specialization);
		return doctors;
	}
	
}
