package com.example.demo.beans;

import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;


@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int petId;
	@Column
	private String petName;
	@ManyToOne
	@JoinColumn(name="type_id")
	private Type type;
	@ManyToOne
	@JoinColumn(name="breed_id")
	private Breed breed;
	@Column
	private int ageMonths;
	@Column
	private int ageYears;
	@OneToOne
	@JoinColumn(name="gender_id")
	private Gender gender;
	@Column
	private boolean adopted;
	@OneToMany
	@JoinColumn(name="owner_id")
	private Owner owner;
	@Column
	private boolean fostered;
	@OneToMany
	@JoinColumn(name="foster_id")
	private Foster foster;
	
	public Pet() {
		petId = 0;
		petName = "Jill Frost";
		type = new Type();
		breed = new Breed();
		ageMonths = 2;
		ageYears = 0;
		gender = new Gender();
		adopted = false;
		owner = new Owner();
		fostered = true;
		foster = new Foster();
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Breed getBreed() {
		return breed;
	}

	public void setBreed(Breed breed) {
		this.breed = breed;
	}

	public int getAgeMonths() {
		return ageMonths;
	}

	public void setAgeMonths(int ageMonths) {
		this.ageMonths = ageMonths;
	}

	public int getAgeYears() {
		return ageYears;
	}

	public void setAgeYears(int ageYears) {
		this.ageYears = ageYears;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public boolean isAdopted() {
		return adopted;
	}

	public void setAdopted(boolean adopted) {
		this.adopted = adopted;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public boolean isFostered() {
		return fostered;
	}

	public void setFostered(boolean fostered) {
		this.fostered = fostered;
	}

	public Foster getFoster() {
		return foster;
	}

	public void setFoster(Foster foster) {
		this.foster = foster;
	}

	@Override
	public String toString() {
		return "Pet [petId=" + petId + ", petName=" + petName + ", type=" + type + ", breed=" + breed + ", ageMonths="
				+ ageMonths + ", ageYears=" + ageYears + ", gender=" + gender + ", adopted=" + adopted + ", owner="
				+ owner + ", fostered=" + fostered + ", foster=" + foster + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(adopted, ageMonths, ageYears, breed, foster, fostered, gender, owner, petId, petName, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pet other = (Pet) obj;
		return adopted == other.adopted && ageMonths == other.ageMonths && ageYears == other.ageYears
				&& Objects.equals(breed, other.breed) && Objects.equals(foster, other.foster)
				&& fostered == other.fostered && Objects.equals(gender, other.gender)
				&& Objects.equals(owner, other.owner) && petId == other.petId && Objects.equals(petName, other.petName)
				&& Objects.equals(type, other.type);
	}

	
}

