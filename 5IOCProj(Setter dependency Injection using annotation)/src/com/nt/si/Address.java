package com.nt.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	
	@Autowired(required=true)
	@Value("201")
	public String flatNo;
	
	@Autowired(required=false)
	@Value("2")
	public String bldgNo;
	
	@Autowired
	@Value("Street NO")
	public String streetNo;
	
	@Autowired
	@Value("Hyderabad")
	public String city;
	
	@Autowired(required=true)
	@Value("500075")
	public int pincode;


	public String getFlatNo() {
		return flatNo;
	}

	//@Autowired
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}


	public String getBldgNo() {
		return bldgNo;
	}


	public void setBldgNo(String bldgNo) {
		this.bldgNo = bldgNo;
	}


	public String getStreetNo() {
		return streetNo;
	}


	public void setStreetNo(String streetNo) {
		System.out.println("setter method is called ");
		this.streetNo = streetNo;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	
	public Address(){
		super();
		System.out.println("Invoking no arg construcotr of Adresss.");
	}

	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", bldgNo=" + bldgNo
				+ ", streetNo=" + streetNo + ", city=" + city + ", pincode="
				+ pincode + "]";
	}
	
	

}
