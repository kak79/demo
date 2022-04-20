package com.rescue.Pets.beans;



import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ownerId;
	@Column(name="usrnm")
	private String username;
	@Column
	private String owner1FirstName;
	@Column
	private String owner1LastName;
	@Column
	private String owner2FirstName;
	@Column
	private String owner2LastName;
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
		
	public Owner() {
		ownerId = 0;
		username = "hawks";
		owner1FirstName = "Cris";
		owner1LastName = "Hawk";
		owner2FirstName = "Amy";
		owner2LastName = "Hawk";
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

	public int getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(int ownerId) {
		this.ownerId = ownerId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOwner1FirstName() {
		return owner1FirstName;
	}

	public void setOwner1FirstName(String owner1FirstName) {
		this.owner1FirstName = owner1FirstName;
	}

	public String getOwner1LastName() {
		return owner1LastName;
	}

	public void setOwner1LastName(String owner1LastName) {
		this.owner1LastName = owner1LastName;
	}

	public String getOwner2FirstName() {
		return owner2FirstName;
	}

	public void setOwner2FirstName(String owner2FirstName) {
		this.owner2FirstName = owner2FirstName;
	}

	public String getOwner2LastName() {
		return owner2LastName;
	}

	public void setOwner2LastName(String owner2LastName) {
		this.owner2LastName = owner2LastName;
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
		return "Owner [ownerId=" + ownerId + ", username=" + username + ", owner1FirstName=" + owner1FirstName
				+ ", owner1LastName=" + owner1LastName + ", owner2FirstName=" + owner2FirstName + ", owner2LastName="
				+ owner2LastName + ", street1=" + street1 + ", street2=" + street2 + ", city=" + city + ", state="
				+ state + ", zip=" + zip + ", phone1=" + phone1 + ", phone2=" + phone2 + ", fax=" + fax + ", email1="
				+ email1 + ", email2=" + email2 + ", website=" + website + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(city, email1, email2, fax, owner1FirstName, owner1LastName, owner2FirstName, owner2LastName,
				ownerId, phone1, phone2, state, street1, street2, username, website, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Owner other = (Owner) obj;
		return Objects.equals(city, other.city) && Objects.equals(email1, other.email1)
				&& Objects.equals(email2, other.email2) && Objects.equals(fax, other.fax)
				&& Objects.equals(owner1FirstName, other.owner1FirstName)
				&& Objects.equals(owner1LastName, other.owner1LastName)
				&& Objects.equals(owner2FirstName, other.owner2FirstName)
				&& Objects.equals(owner2LastName, other.owner2LastName) && ownerId == other.ownerId
				&& Objects.equals(phone1, other.phone1) && Objects.equals(phone2, other.phone2)
				&& Objects.equals(state, other.state) && Objects.equals(street1, other.street1)
				&& Objects.equals(street2, other.street2) && Objects.equals(username, other.username)
				&& Objects.equals(website, other.website) && zip == other.zip;
	}

	
	
}

