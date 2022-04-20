package com.rescue.Pets.beans;



import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Breed {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int breedId;
	@Column
	private String breedName;
	
	public Breed() {
		breedId = 0;
		breedName = "Bichon Frise";
	}

	public int getBreedId() {
		return breedId;
	}

	public void setBreedId(int breedId) {
		this.breedId = breedId;
	}

	public String getBreedName() {
		return breedName;
	}

	public void setBreedName(String breedName) {
		this.breedName = breedName;
	}

	@Override
	public String toString() {
		return "Breed [breedId=" + breedId + ", breedName=" + breedName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(breedId, breedName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Breed other = (Breed) obj;
		return breedId == other.breedId && Objects.equals(breedName, other.breedName);
	}
	
}

