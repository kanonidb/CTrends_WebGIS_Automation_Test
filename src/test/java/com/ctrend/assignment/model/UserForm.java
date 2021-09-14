package com.ctrend.assignment.model;

import javax.persistence.*;
import java.io.Serializable;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
public class UserForm implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id")
	private Long id;

	@Column(name = "code")
	private String code;
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	@Column(name = "roadtype")
	private String roadType;
	@Column(name = "Vehicletype")
	private String VehicleType;

	public UserForm() {

	}

	public UserForm(Long id, String code, String name, String description, String roadType, String vehicleType) {
		this.id = id;
		this.code = code;
		this.name = name;
		this.description = description;
		this.roadType = roadType;
		VehicleType = vehicleType;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRoadType() {
		return roadType;
	}

	public void setRoadType(String roadType) {
		this.roadType = roadType;
	}

	public String getVehicleType() {
		return VehicleType;
	}

	public void setVehicleType(String vehicleType) {
		VehicleType = vehicleType;
	}

	@Override
	public String toString() {
		return "UserForm{" +
				"id=" + id +
				", code='" + code + '\'' +
				", name='" + name + '\'' +
				", description='" + description + '\'' +
				", roadType='" + roadType + '\'' +
				", VehicleType='" + VehicleType + '\'' +
				'}';
	}
}
