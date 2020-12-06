package com.fpt.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "guest")
public class GuestEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long idGuest;
	@Column(name="fullname")
	private String fullname;
	@Column(name="birthDated")
	private String birthDate;
	@Column(name="birthday")
	private Date birthday;
	@Column(name="email")
	private String email;
	@Column(name="phone ")
	private String phone ;
	@Column(name="address")
	private String address;
	
	
	@OneToMany(mappedBy = "guest")
	private List<InvoiceEntity> guest = new ArrayList<>();

	public Long getIdGuest() {
		return idGuest;
	}

	public void setIdGuest(Long idGuest) {
		this.idGuest = idGuest;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
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

	public List<InvoiceEntity> getGuests() {
		return guest;
	}

	public void setGuests(List<InvoiceEntity> guests) {
		guest = guests;
	}


	
	
}
