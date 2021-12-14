package com;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="booking")
public class Booking {

	private long id;
	private String Firstname;
	private String Lastname;
	 private Long Phone;
	 private String Email;
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private Date CheckinDate;
	 @DateTimeFormat(pattern = "yyyy-MM-dd")
	 private Date CheckoutDate;
	 private int NoOfPersons;
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return Firstname;
	}
	public void setFirstname(String firstname) {
		Firstname = firstname;
	}
	public String getLastname() {
		return Lastname;
	}
	public void setLastname(String lastname) {
		Lastname = lastname;
	}
	public Long getPhone() {
		return Phone;
	}
	public void setPhone(Long phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Date getCheckinDate() {
		return CheckinDate;
	}
	public void setCheckinDate(Date checkinDate) {
		CheckinDate = checkinDate;
	}
	public Date getCheckoutDate() {
		return CheckoutDate;
	}
	public void setCheckoutDate(Date checkoutDate) {
		CheckoutDate = checkoutDate;
	}
	public int getNoOfPersons() {
		return NoOfPersons;
	}
	public void setNoOfPersons(int noOfPersons) {
		NoOfPersons = noOfPersons;
	}
	
}
