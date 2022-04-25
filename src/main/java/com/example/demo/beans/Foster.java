package com.example.demo.beans;



import java.util.Objects;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Entity
public class Foster {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fosterId;
	@OneToOne
	@JoinColumn(name="login_id")
	private Login login;
	@Column
	private String foster1FirstName;
	@Column
	private String foster1LastName;
	@Column
	private String foster2FirstName;
	@Column
	private String foster2LastName;
	@Column
	private String street1;
	@Column
	private String street2;
	@Column
	private String city;
	@Column
	private String state;
	@Column
	private int zip;
	@Column
	private String phone1;
	@Column
	private String phone2;
	@Column
	private String fax;
	@Column
	private String email1;
	@Column
	private String email2;
	

	public Foster() {
		fosterId = 0;
		login = new Login();
		foster1FirstName = "Jane";
		foster1LastName = "Smith";
		foster2FirstName = "John";
		foster2LastName = "Smith";
		street1 = "123 Z ST";
		street2 = "";
		city = "New York";
		state = "NY";
		zip = 12345;
		phone1 = "(123)456-7890";
		phone2 = "(123)456-7890";
		fax = "(123)456-7890";
		email1 = "abc@123.com";
		email2 = "abc@123.com";
	}


	public int getFosterId() {
		return fosterId;
	}


	public void setFosterId(int fosterId) {
		this.fosterId = fosterId;
	}


	public Login getLogin() {
		return login;
	}


	public void setLogin(Login login) {
		this.login = login;
	}


	public String getFoster1FirstName() {
		return foster1FirstName;
	}


	public void setFoster1FirstName(String foster1FirstName) {
		this.foster1FirstName = foster1FirstName;
	}


	public String getFoster1LastName() {
		return foster1LastName;
	}


	public void setFoster1LastName(String foster1LastName) {
		this.foster1LastName = foster1LastName;
	}


	public String getFoster2FirstName() {
		return foster2FirstName;
	}


	public void setFoster2FirstName(String foster2FirstName) {
		this.foster2FirstName = foster2FirstName;
	}


	public String getFoster2LastName() {
		return foster2LastName;
	}


	public void setFoster2LastName(String foster2LastName) {
		this.foster2LastName = foster2LastName;
	}


	public String getStreet1() {
		return street1;
	}


	public void setStreet1(String street1) {
		this.street1 = street1;
	}


	public String getStreet2() {
		return street2;
	}


	public void setStreet2(String street2) {
		this.street2 = street2;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getZip() {
		return zip;
	}


	public void setZip(int zip) {
		this.zip = zip;
	}


	public String getPhone1() {
		return phone1;
	}


	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}


	public String getPhone2() {
		return phone2;
	}


	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}


	public String getFax() {
		return fax;
	}


	public void setFax(String fax) {
		this.fax = fax;
	}


	public String getEmail1() {
		return email1;
	}


	public void setEmail1(String email1) {
		this.email1 = email1;
	}


	public String getEmail2() {
		return email2;
	}


	public void setEmail2(String email2) {
		this.email2 = email2;
	}


	@Override
	public String toString() {
		return "Foster [fosterId=" + fosterId + ", login=" + login + ", foster1FirstName=" + foster1FirstName
				+ ", foster1LastName=" + foster1LastName + ", foster2FirstName=" + foster2FirstName
				+ ", foster2LastName=" + foster2LastName + ", street1=" + street1 + ", street2=" + street2 + ", city="
				+ city + ", state=" + state + ", zip=" + zip + ", phone1=" + phone1 + ", phone2=" + phone2 + ", fax="
				+ fax + ", email1=" + email1 + ", email2=" + email2 + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(city, email1, email2, fax, foster1FirstName, foster1LastName, foster2FirstName,
				foster2LastName, fosterId, phone1, phone2, state, street1, street2, login, zip);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foster other = (Foster) obj;
		return Objects.equals(city, other.city) && Objects.equals(email1, other.email1)
				&& Objects.equals(email2, other.email2) && Objects.equals(fax, other.fax)
				&& Objects.equals(foster1FirstName, other.foster1FirstName)
				&& Objects.equals(foster1LastName, other.foster1LastName)
				&& Objects.equals(foster2FirstName, other.foster2FirstName)
				&& Objects.equals(foster2LastName, other.foster2LastName) && fosterId == other.fosterId
				&& Objects.equals(phone1, other.phone1) && Objects.equals(phone2, other.phone2)
				&& Objects.equals(state, other.state) && Objects.equals(street1, other.street1)
				&& Objects.equals(street2, other.street2) && Objects.equals(login, other.login)
				&& zip == other.zip;
	}


	
}

