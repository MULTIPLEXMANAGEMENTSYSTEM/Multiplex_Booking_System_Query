package com.MBS.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MBS.Model.Shows;
import com.MBS.Repository.ShowsRepo;

@Service
public class ShowsService {
	
	@Autowired
	ShowsRepo repo;
	
	public Optional<Shows> findByShowId(int showId) {
		return repo.findById(showId);
	}
	
}