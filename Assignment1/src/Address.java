package com.example;


import java.io.Serializable;

//import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

//@Embeddable
@Entity
public class Address implements Serializable
{	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int addressId;
	private String Hname,area,city;
	private int pincode;
	@OneToOne(targetEntity=Employee.class)
	private Employee employee;
	
	/*public Address(int addressId, String hname, String area, String city, int pincode, Employee employee) {
		super();
		this.addressId = addressId;
		Hname = hname;
		this.area = area;
		this.city = city;
		this.pincode = pincode;
		this.employee = employee;
	}
*/
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	

	public Address() //default constructor
	{
		
	}
	// use getter setter method
	public String getHname() {
		return Hname;
	}

	public void setHname(String hname) {
		Hname = hname;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	
	

}