package com.MBS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MBS.Model.Hall;
import com.MBS.Repository.HallRepo;

@Service
public class HallService {
	
	@Autowired
	HallRepo repo;

	public Optional<Hall> findByHallId(int hallId) {
		return repo.findById(hallId);
	}
	
	
	

}
