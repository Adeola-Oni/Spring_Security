package com.adeola.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
	
	@GetMapping("/booking")
	public String myBookings() {
		return "This shows all my bookings";
	}

}
