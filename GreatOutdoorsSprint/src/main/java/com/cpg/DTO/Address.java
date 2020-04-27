package com.cpg.DTO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Range;

@Entity
@Table(name="address00")
public class Address {
	Address()
	{
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Address_Id",nullable=false)
   	@Range(min=1,max=Long.MAX_VALUE,message="Address Id InValid")
	private String AddressId;
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Retailor_Id",nullable=false)
   	@Range(min=1,max=Long.MAX_VALUE,message="Reatailor Id InValid")
	private String retailerId;
	@NotBlank(message = "Address City cannot be empty")
   	@Column(name="Address_City",nullable=false)
	private String city;
	@NotBlank(message = "Address state cannot be empty")
   	@Column(name="Address_state",nullable=false)
	private String state;
	@NotBlank(message = "Address Zip cannot be empty")
   	@Column(name="Address_Zip",nullable=false)
	private String zip;
	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "User_Id",nullable = false)
	private User user;
	public Address(String addressId, String retailerId, String city, String state, String zip, String buldingNo,
			String field) {
		super();
		AddressId = addressId;
		this.retailerId = retailerId;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.field = field;
	}
	@Column
	private String field;
	public String getAddressId() {
		return AddressId;
	}
	public void setAddressId(String addressId) {
		AddressId = addressId;
	}
	public String getRetailerId() {
		return retailerId;
	}
	public void setRetailerId(String retailerId) {
		this.retailerId = retailerId;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}


}


