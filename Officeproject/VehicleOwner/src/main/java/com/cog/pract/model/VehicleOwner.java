package com.cog.pract.model;

import org.springframework.boot.persistence.autoconfigure.EntityScan;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;


@Entity
@Table(name="vehicleowner")
@AllArgsConstructor
public class VehicleOwner {
	
	 @Id
	  @GeneratedValue(strategy=GenerationType.AUTO)
	 private Long id;
	 @Column(name ="numberplate")
	 private String numberplate;
	 @Column(name ="vehicleownername")
	 private String vehiclewnerName;
	 @Column(name ="enginenumber")
	 private String engineNumber;
	 @Column(name ="chasis")
	 private String chasis;
	 @Column(name ="mobile")
	 private long mobile;
	 @Column(name ="city")
	 private String city;
	 @Column(name ="state")
	 private String state;
	 
	 

	public String getNumberPlate() {
		return numberplate;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberplate = numberPlate;
	}
	public String getVehiclewnerName() {
		return vehiclewnerName;
	}
	public void setVehiclewnerName(String vehiclewnerName) {
		this.vehiclewnerName = vehiclewnerName;
	}
	public String getEngineNumber() {
		return engineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		this.engineNumber = engineNumber;
	}
	public String getChasis() {
		return chasis;
	}
	public void setChasis(String chasis) {
		this.chasis = chasis;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
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
	public VehicleOwner(String numberplate, String vehiclewnerName, String engineNumber, String chasis, long mobile,
			String city, String state) {
		super();
		this.numberplate = numberplate;
		this.vehiclewnerName = vehiclewnerName;
		this.engineNumber = engineNumber;
		this.chasis = chasis;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
	}
	public VehicleOwner() {
		super();
	}
	 
	 
	 

}
