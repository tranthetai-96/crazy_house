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
@Table(name = "room")
public class RoomEntity {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long idroom;
	@Column(name="nameRoom")
	private String nameRoom;
	@Column(name="roomNumber")
	private long roomNumber;
	@Column(name="price")
	private long price;
	@Column(name="image")
	private String image;
	
	@OneToMany(mappedBy = "room")
	private List<BookingEntity> room = new ArrayList<>();

	public long getIdroom() {
		return idroom;
	}

	public void setIdroom(long idroom) {
		this.idroom = idroom;
	}

	public String getNameRoom() {
		return nameRoom;
	}

	public void setNameRoom(String nameRoom) {
		this.nameRoom = nameRoom;
	}

	public long getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(long roomNumber) {
		this.roomNumber = roomNumber;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<BookingEntity> getRoom() {
		return room;
	}

	public void setRoom(List<BookingEntity> room) {
		this.room = room;
	}
	
	
}
