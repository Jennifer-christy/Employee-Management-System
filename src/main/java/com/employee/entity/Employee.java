package com.employee.entity;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table (name="employee",uniqueConstraints= {@UniqueConstraint(columnNames="email")})
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
    @Column(name="email",nullable=false,length=50)
	private String email;
    @Column(name="name",nullable=false,length=25)
	private String name;	
    @Column(name="place",nullable=false,length=25)
	private String place;
    @Column(name="phone_no",nullable=false,length=30)
    private long phone_no;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	
	public  Employee(){
		
	}
	public Employee(Integer id, String email, String name, String place, long phone_no) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.place = place;
		this.phone_no = phone_no;
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, name, phone_no, place);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& phone_no == other.phone_no && Objects.equals(place, other.place);
	}
	
	
//  public Integer getId() {
//		return id;
//	}
//
//	public void setId(Integer id) {
//		this.id = id;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getPlace() {
//		return place;
//	}
//
//	public void setPlace(String place) {
//		this.place = place;
//	}
//	
//   public  Employee(){
//		
//	}
//
//	public Employee(String email, String name, String place) {
//		super();
//		this.email = email;
//		this.name = name;
//		this.place = place;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(email, id, name, place);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(email, other.email) && Objects.equals(id, other.id) && Objects.equals(name, other.name)
//				&& Objects.equals(place, other.place);
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", email=" + email + ", name=" + name + ", place=" + place + "]";
//	}
	
	
}
