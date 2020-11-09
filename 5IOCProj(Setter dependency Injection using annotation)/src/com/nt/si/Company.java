package com.nt.si;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value= "company1")
public class Company {
	
	//@Configuration
	@Autowired(required=true)
	@Value("ySrinivas")
	String companyCEO;
	
	@Autowired(required=false)
	Address companyAddress;

	public String getCompanyCEO() {
		return companyCEO;
	}

	public void setCompanyCEO(String companyCEO) {
		this.companyCEO = companyCEO;
	}

	public Address getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(Address companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Override
	public String toString() {
		return "Company [companyCEO=" + companyCEO + ", companyAddress="
				+ companyAddress + "]";
	}
	
	

}
