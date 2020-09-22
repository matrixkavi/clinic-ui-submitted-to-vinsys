package com.example.appointment.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.appointment.bean.Doctor;
import com.example.appointment.service.DoctorsService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DoctorsController {

	@Autowired
	private Environment env;
	
	@Autowired
	private DoctorsService docSvc;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("enquiry/specialization/{specialization}")
	public List<Doctor> getDoctorsWithSpecialization(@PathVariable String specialization){
		logger.info("Inside AppointmentController::getDoctorsWithSpecialization");
		List<Doctor> doctors = docSvc.getDoctorsWithSpecialization(specialization);
		int port = Integer.parseInt(env.getProperty("local.server.port"));
		for(Doctor doctor: doctors){
			doctor.setPort(port);
		}
		return doctors;
	}
}
