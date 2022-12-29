package com.example;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Employee_Details")
public class Employee //class
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int eid;
	private String ename;
	private String edept;
	private int esalary;
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	private  Address address ;
	/*public Employee(int eid, String ename, String edept, int esalary, Address address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.edept = edept;
		this.esalary = esalary;
		this.address = address;
	}
	*/
	
	
	
	public Employee()//default constructor
	{
		
	}
	// use getter setter method
	public int getEid() 
	{
		return eid;
	}
	public void setEid(int eid) 
	{
		this.eid = eid;
	}
	public String getEname()
	{
		return ename;
	}
	public void setEname(String ename) 
	{
		this.ename = ename;
	}
	public String getEdept() 
	{
		return edept;
	}
	public void setEdept(String edept) 
	{
		this.edept = edept;
	}
	public int getEsalary() 
	{
		return esalary;
	}
	public void setEsalary(int esalary) 
	{
		this.esalary = esalary;
	}
	public Address getAddress() 
	{
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	
	
	
	

}
