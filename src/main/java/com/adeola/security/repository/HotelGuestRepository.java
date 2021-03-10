package com.adeola.security.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.adeola.security.model.HotelGuest;

@Repository
public interface HotelGuestRepository extends CrudRepository<HotelGuest, Long>{
	List<HotelGuest>  findByEmail(String email);
}


