package com.MBS.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MBS.Model.Movies;
import com.MBS.Repository.MoviesRepo;

@Service
public class MoviesService {
	
	@Autowired
	MoviesRepo repo;
	
	public List<Movies> findByMovieName(String movieName) { 
		return repo.findByMovieName(movieName); 
		}

}
