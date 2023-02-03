package com.soumya.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profile {

	@Value("Java Programmer")
	private String title;
	@Value("DBS Bank")
	private String company;

	@Override
	public String toString() {
		return "Profile [title=" + title + ", company=" + company + "]";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
