package com.hms.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.hms.demo.model.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor,Integer>{

}
