package com.example.demo.beans;

import java.util.Objects;

import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

@Table(name="typ")
@Entity
public class Type {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int typeId;
	@Column
	private String typeName;
	
	public Type() {
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
		return "Type [typeId=" + typeId + ", typeName=" + typeName + "]";
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
		Type other = (Type) obj;
		return typeId == other.typeId && Objects.equals(typeName, other.typeName);
	}
	
	
	
}

