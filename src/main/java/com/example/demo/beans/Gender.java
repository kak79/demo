package com.rescue.Pets.beans;



import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Gender {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int genderId;
	@Column
	private String genderName;
	
	public Gender() {
		genderId = 0;
		genderName = "Female";
	}

	public int getGenderId() {
		return genderId;
	}

	public void setGenderId(int genderId) {
		this.genderId = genderId;
	}

	public String getGenderName() {
		return genderName;
	}

	public void setGenderName(String genderName) {
		this.genderName = genderName;
	}

	@Override
	public String toString() {
		return "Gender [genderId=" + genderId + ", genderName=" + genderName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genderId, genderName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gender other = (Gender) obj;
		return genderId == other.genderId && Objects.equals(genderName, other.genderName);
	}
	
}

