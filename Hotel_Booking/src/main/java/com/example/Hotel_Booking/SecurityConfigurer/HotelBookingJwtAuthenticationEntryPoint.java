package com.example.Hotel_Booking.SecurityConfigurer;

import java.io.IOException;
import java.io.Serializable;

import javax.naming.AuthenticationException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component
public   class HotelBookingJwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {
		private static final long serialVersionUID = -7858869558953243875L;
		public void commence(HttpServletRequest request, HttpServletResponse response,
				AuthenticationException authException) throws IOException {
		}

		@Override
		public void commence(HttpServletRequest request, HttpServletResponse response, org.springframework.security.core.AuthenticationException authException) throws IOException, ServletException 
		{
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Unauthorized");	
		}
}

