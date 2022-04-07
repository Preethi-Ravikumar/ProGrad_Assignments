package com.example.Hotel_Booking.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.Hotel_Booking.Model.AuthenticationRequest;
import com.example.Hotel_Booking.Model.AuthenticationResponse;
//import com.example.Hotel_Booking.Model.HotelBookingModel;
import com.example.Hotel_Booking.Model.HotelBookingModelJwt;
import com.example.Hotel_Booking.Repository.HotelBookingRepo;
import com.example.Hotel_Booking.SecurityConfigurer.JwtTokenUtil;
import com.example.Hotel_Booking.Service.MyUserDetailsService;

@Controller
public class HotelBookingController {
	@Autowired
	HotelBookingRepo repo;
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private MyUserDetailsService userDetailsService;
	
	//@RequestMapping(value = "/hello", method = RequestMethod.GET)
	@RequestMapping(value="/hello")
	@ResponseBody()
	public String hello()
	{
		return "Hello world";
	}

	@RequestMapping(value = "/authenticate", method = RequestMethod.POST)
	public ResponseEntity<?> createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
			throws Exception {
		try {
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken
					(authenticationRequest.getName(), authenticationRequest.getPassword()));
			} 
		catch (BadCredentialsException e) {

			throw new Exception("Incorrect Username or Password");

		}
		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getName());
		final String jwt = jwtTokenUtil.generateToken(userDetails);
		return ResponseEntity.ok(new AuthenticationResponse(jwt));
		}
	@RequestMapping(value = "/register", method = RequestMethod.POST)

	public ResponseEntity<?> saveUser(@RequestBody HotelBookingModelJwt user) throws Exception {

		return ResponseEntity.ok(userDetailsService.save(user));

	}
}