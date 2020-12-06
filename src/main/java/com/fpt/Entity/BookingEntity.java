package com.fpt.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "booking")
public class BookingEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long idbooking;
	@Column(name="serviceId")
	private long serviceId;
	@Column(name="ReservationID")
	private long ReservationID;
	
	@ManyToOne
	 @JoinColumn(name = "roomid")
  private RoomEntity room;
	
	@ManyToOne
	 @JoinColumn(name = "reservation")
   private ReservationEntity reservations;
	public long getIdbooking() {
		return idbooking;
	}
	public void setIdbooking(long idbooking) {
		this.idbooking = idbooking;
	}
	public long getServiceId() {
		return serviceId;
	}
	public void setServiceId(long serviceId) {
		this.serviceId = serviceId;
	}
	public long getReservationID() {
		return ReservationID;
	}
	public void setReservationID(long reservationID) {
		ReservationID = reservationID;
	}
	public RoomEntity getRoomid() {
		return room;
	}
	public void setRoomid(RoomEntity room) {
		this.room = room;
	}
	public ReservationEntity getReservations() {
		return reservations;
	}
	public void setReservations(ReservationEntity reservations) {
		this.reservations = reservations;
	}
	
	
}
