package com.example.Hotel_Booking.Model;

import javax.persistence.*;
@Entity

@Table(name = "user")
public class HotelBookingModelJwt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column
	private String name;
	@Column
	private String email;
	@Column(nullable=false)

	
	private String password;
	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}



	public String getEmail() {

		return email;

	}



	public void setEmail(String email) {

		this.email = email;

	}



	public String getPassword() {

		return password;

	}



	public void setPassword(String password) {

		this.password = password;

	}



}

