package com.fpt.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class ReservationEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long ReservationID;
	@Column(name="guestId")
	private Long guestId;
	@Column(name="serviceName ")
	private String serviceName ;
	@Column(name="number_of_rooms")
	private Long number_of_rooms;
	@Column(name="number_of_guestserviceName")
	private Long number_of_guestserviceName ;
	
	@OneToMany(mappedBy = "reservation")
	private List<InvoiceEntity> reservation = new ArrayList<>();
	@OneToMany(mappedBy = "reservations")
	private List<BookingEntity> reservations = new ArrayList<>();

	public Long getReservationID() {
		return ReservationID;
	}

	public void setReservationID(Long reservationID) {
		ReservationID = reservationID;
	}

	public Long getGuestId() {
		return guestId;
	}

	public void setGuestId(Long guestId) {
		this.guestId = guestId;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public Long getNumber_of_rooms() {
		return number_of_rooms;
	}

	public void setNumber_of_rooms(Long number_of_rooms) {
		this.number_of_rooms = number_of_rooms;
	}

	public Long getNumber_of_guestserviceName() {
		return number_of_guestserviceName;
	}

	public void setNumber_of_guestserviceName(Long number_of_guestserviceName) {
		this.number_of_guestserviceName = number_of_guestserviceName;
	}

	public List<InvoiceEntity> getReservation() {
		return reservation;
	}

	public void setReservation(List<InvoiceEntity> reservation) {
		this.reservation = reservation;
	}

	public List<BookingEntity> getReservations() {
		return reservations;
	}

	public void setReservations(List<BookingEntity> reservations) {
		this.reservations = reservations;
	}
	
	
}
