package com.cooksys.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "AppUser")
public class AppUser {

	@Id
	@GeneratedValue
	private long id;

	@Column(name = "Name")
	private String name;

	@Column(name = "City")
	private String city;

	@Column(name = "State")
	private String state;

	@ManyToOne
	@JoinColumn(name="Role")
	private AppRole role;

	@ManyToMany(mappedBy = "members")
	private List<AppGroup> groups;

	public AppUser() {

	}
	
	public AppUser(String name, String city, String state, AppRole role) {
		this.name = name;
		this.city = city;
		this.state = state;
		this.role = role;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public AppRole getRole() {
		return role;
	}

	public void setRole(AppRole role) {
		this.role = role;
	}

	public List<AppGroup> getGroups() {
		return groups;
	}

	public void setGroups(List<AppGroup> groups) {
		this.groups = groups;
	}
}
