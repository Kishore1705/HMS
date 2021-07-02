package com.hms.demo.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Doctor")
public class Doctor implements Serializable {
	
	
	public Doctor(String docName, String specialization, Date day, String time) {

        this.docname = docname;
        this.specialization = specialization;
        this.day = day;
        this.time = time;
    }
	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getDocname() {
		return docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}

	public Date getDay() {
		return  day;
	}

	public void setDay(Date day) {
		day = new Date();
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID")
	private int doctorId;
	
	
	@Column(name = "specialization")
	private String specialization;
	
	
	@Column(name = "docname")
	private String docname;
	
	
    @Column(name = "day")
    private Date day;
	
    
    @Column(name = "time")
    private String time;

	
	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}	
	public Doctor() {
		
	}
}
