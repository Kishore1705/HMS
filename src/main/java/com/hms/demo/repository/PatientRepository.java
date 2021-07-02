package com.hms.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.hms.demo.model.Patient;

public interface PatientRepository extends CrudRepository<Patient,Long>{

}
