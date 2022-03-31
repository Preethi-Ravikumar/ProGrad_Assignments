package com.hotelBooking.mainApp;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HRepository extends CrudRepository<Register,String>{

	Register findByEmail(String email);

}
