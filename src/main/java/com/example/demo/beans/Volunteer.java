package com.example.demo.beans;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Entity
public class Volunteer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int volunteerId;
	@OneToOne
	@JoinColumn(name="login_id")
	private AllLogin login;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private String phone;
	@Column
	private String email;



	public Volunteer() {
		volunteerId = 0;
		login = new AllLogin();
		firstName = "Jane";
		lastName = "Smith";
		phone = "(123)456-7890";
		email = "abc@123.com";
	}


	public int getVolunteerId() {
		return volunteerId;
	}


	public void setVolunteerId(int fosterId) {
		this.volunteerId = volunteerId;
	}


	public AllLogin getLogin() {
		return login;
	}


	public void setLogin(AllLogin login) {
		this.login = login;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String foster1FirstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String foster1LastName) {
		this.lastName = lastName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone1) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email1) {
		this.email = email;
	}


	@Override
	public String toString() {
		return "Volunteer [volunteerId=" + volunteerId + ", login=" + login + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", phone=" + phone + ", email=" + email + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(email, firstName, lastName, volunteerId, phone,  login);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Volunteer other = (Volunteer) obj;
		return Objects.equals(email, other.email)
				&& Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName)
				&& volunteerId == other.volunteerId
				&& Objects.equals(phone, other.phone)
				&& Objects.equals(login, other.login);
	}


	
}

