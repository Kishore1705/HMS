package com.hms.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hms.demo.model.Appointment;
import com.hms.demo.model.Doctor;
import com.hms.demo.repository.DoctorRepository;

@RestController
public class DoctorContoller {
		
	
	@Autowired
	DoctorRepository doctorrepo;

	@PostMapping(value="/create")
	public void createDoc(@RequestBody Doctor doc) {
		
		if(doc!=null) {
			
			doctorrepo.save(doc);
			
		}
		

	}
	@GetMapping(value="/Bookappoint")
	public String BookAppointment (){
		System.out.println("BookAppointment");
		return "BookAppointment";
	}
	
	
}
