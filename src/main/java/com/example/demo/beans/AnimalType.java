package com.rescue.Pets.beans;



import java.util.Objects;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class AnimalType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int typeId;
	@Column
	private String typeName;
	
	public AnimalType() {
		typeId = 0;
		typeName = "Dog";
	}

	public int getTypeId() {
		return typeId;
	}

	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	@Override
	public String toString() {
		return "AnimalType [typeId=" + typeId + ", typeName=" + typeName + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(typeId, typeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AnimalType other = (AnimalType) obj;
		return typeId == other.typeId && Objects.equals(typeName, other.typeName);
	}
	
	
	
}

