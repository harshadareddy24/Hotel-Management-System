package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class BookingService {
	@Autowired
	private BookingRepository bRepo;
	
	public List<Booking> listAll() {
        return bRepo.findAll();
    }
}
