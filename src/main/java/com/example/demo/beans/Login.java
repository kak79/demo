package com.example.demo.beans;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.Objects;

@Table(name="all_logins")
@Entity
public class Login {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginId;
	@OneToOne
	@JoinColumn(name = "volunteer_id")
	private Volunteer volunteer;
	@OneToOne
	@JoinColumn(name = "foster_id")
	private Foster foster;
	@OneToOne
	@JoinColumn(name = "owner_id")
	private Owner owner;
	@Column(name = "usrnm")
	private String username;
	@Column(name = "psswrd")
	private String password;

	public Login() {
		loginId = 0;
		volunteer = new Volunteer();
		foster = new Foster();
		owner = new Owner();
		username = "username";
		password = "pass";
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int petId) {
		this.loginId = loginId;
	}

	public Volunteer getVolunteer() {
		return volunteer;
	}

	public void setVolunteer(Volunteer volunteer) {
		this.volunteer = volunteer;
	}

	public Foster getFoster() {
		return foster;
	}

	public void setFoster(Foster foster) {
		this.foster = foster;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", volunteer=" + volunteer + ", foster=" + foster +
				", owner=" + owner + ", username =" + username + ", password=" + password + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(loginId, volunteer, foster, owner, username, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return loginId == other.loginId && Objects.equals(foster, other.foster)
				&& Objects.equals(volunteer, other.volunteer) && Objects.equals(owner, other.owner)
				&& Objects.equals(username, other.username) && Objects.equals(password, other.password);

	}

}