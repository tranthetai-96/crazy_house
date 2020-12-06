package com.fpt.Entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Invoice")
public class InvoiceEntity {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private Long idInvoice;
	
	@ManyToOne
	 @JoinColumn(name = "Invoiceid")
   private EmployeeEntity employee;
	@ManyToOne
	 @JoinColumn(name = "Reservationid")
   private ReservationEntity reservation;
	@ManyToOne
	 @JoinColumn(name = "Guestid")
  private GuestEntity guest;
	
	
	public Long getIdInvoice() {
		return idInvoice;
	}
	public void setIdInvoice(Long idInvoice) {
		this.idInvoice = idInvoice;
	}
	public EmployeeEntity getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeEntity employee) {
		this.employee = employee;
	}
	public ReservationEntity getReservation() {
		return reservation;
	}
	public void setReservation(ReservationEntity reservation) {
		this.reservation = reservation;
	}
//	public GuestEntity getGuest() {
//		return guest;
//	}
//	public void setGuest(GuestEntity guest) {
//		this.guest = guest;
//	}
	
	
}
