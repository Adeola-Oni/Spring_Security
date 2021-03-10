package com.adeola.security.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.adeola.security.model.HotelGuest;
import com.adeola.security.model.SecurityHotelGuest;
import com.adeola.security.repository.HotelGuestRepository;

@Service
public class HotelGuestUserDetails implements UserDetailsService{
	
	@Autowired
	private HotelGuestRepository hotelGuestRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		List<HotelGuest> hotelGuest = hotelGuestRepository.findByEmail(username);
		if(hotelGuest.size() == 0) {
			throw new UsernameNotFoundException("The user: "+ username +" was not found");
		}
		return new SecurityHotelGuest(hotelGuest.get(0));
	}
}



