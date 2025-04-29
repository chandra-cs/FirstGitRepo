package com.cs.service;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.cs.model.Footballer;

public interface IFootballerService {
	
	public String registerFootballer(Footballer footballer) throws Exception;
	public Optional<Footballer>  getFootballerById(Integer id) throws Exception;
	public Optional<Footballer> searchFootballerByName(String playerName) throws Exception;
	public Page<Footballer> showAllPlayerDetails(Pageable pageable) throws Exception;
}
