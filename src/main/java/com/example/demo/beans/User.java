package com.example.demo.beans;

import java.util.Objects;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Table(name="own_r")
@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;

//	username varchar(30) not null unique,
//	psswrd varchar(10) not null,
//	pet_owner bool,
//	foster_parent bool,
//	pet_volunteer bool,


	@Column
	private String user1FirstName;
	@Column
	private String user1LastName;
	@Column
	private String user2FirstName;
	@Column
	private String user2LastName;
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
	@Column
	private String website;
		
	public User() {
		userId = 0;

		user1FirstName = "Cris";
		user1LastName = "Hawk";
		user2FirstName = "Amy";
		user2LastName = "Hawk";
		street1 = "9 Hoard Drive";
		street2 = "# 4529";
		city = "Irvine";
		state = "CA";
		zip = 92619;
		phone1 = "(949)549-9620";
		phone2 = "(949)549-2803";
		fax = "(949)549-4567";
		email1 = "cris0@hawksisters.com";
		email2 = "amy0@hawksisters.com";
		website = "http://www.hawksistersanimalrescue.com";
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int ownerId) {
		this.userId = ownerId;
	}

//	public Login getLogin() {
//		return login;
//	}
//
//	public void setLogin(Login login) {
//		this.login = login;
//	}

	public String getUser1FirstName() {
		return user1FirstName;
	}

	public void setUser1FirstName(String owner1FirstName) {
		this.user1FirstName = owner1FirstName;
	}

	public String getUser1LastName() {
		return user1LastName;
	}

	public void setUser1LastName(String owner1LastName) {
		this.user1LastName = owner1LastName;
	}

	public String getUser2FirstName() {
		return user2FirstName;
	}

	public void setUser2FirstName(String owner2FirstName) {
		this.user2FirstName = owner2FirstName;
	}

	public String getUser2LastName() {
		return user2LastName;
	}

	public void setUser2LastName(String owner2LastName) {
		this.user2LastName = owner2LastName;
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

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId +  ", user1FirstName=" + user1FirstName
				+ ", user1LastName=" + user1LastName + ", user2FirstName=" + user2FirstName + ", user2LastName="
				+ user2LastName + ", street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phone1=" + phone1 + ", phone2=" + phone2 + ", fax=" + fax + ", email1="
				+ email1 + ", email2=" + email2 + ", website=" + website + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, email1, email2, fax, user1FirstName, user1LastName, user2FirstName, user2LastName,
				userId, phone1, phone2, state, street1, street2, website, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(city, other.city) && Objects.equals(email1, other.email1)
				&& Objects.equals(email2, other.email2) && Objects.equals(fax, other.fax)
				&& Objects.equals(user1FirstName, other.user1FirstName)
				&& Objects.equals(user1LastName, other.user1LastName)
				&& Objects.equals(user2FirstName, other.user2FirstName)
				&& Objects.equals(user2LastName, other.user2LastName) && userId == other.userId
				&& Objects.equals(phone1, other.phone1) && Objects.equals(phone2, other.phone2)
				&& Objects.equals(state, other.state) && Objects.equals(street1, other.street1)
				&& Objects.equals(street2, other.street2)
				&& Objects.equals(website, other.website) && zip == other.zip;
	}

	
	
}

