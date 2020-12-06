package com.fpt.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long idemployee;
	@Column(name="fullName")
	private String fullName;
	@Column(name="birthday")
	private Date birthday;
	@Column(name="email")
	private String email;
	@Column(name="phone ")
	private String phone ;
	@Column(name="address")
	private String address;
	@Column(name="employeeType")
	private Boolean employeeType ;
	@Column(name="status")
	private Boolean status ;
	@Column(name="image")
	private String image ;

	
	@OneToMany(mappedBy = "employee")
	private List<InvoiceEntity> employees = new ArrayList<>();

	public Long getIdemployee() {
		return idemployee;
	}

	public void setIdemployee(Long idemployee) {
		this.idemployee = idemployee;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Boolean getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(Boolean employeeType) {
		this.employeeType = employeeType;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}


	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}



	public List<InvoiceEntity> getEmployees() {
		return employees;
	}

	public void setEmployees(List<InvoiceEntity> employees) {
		this.employees = employees;
	}
	
	
}
