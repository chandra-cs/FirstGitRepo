package com.cs.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.cs.model.Footballer;
import com.cs.repository.IFootballerRepository;

@Service
public class FootballerServiceImpl implements IFootballerService {

@Autowired
private IFootballerRepository footballerRepo;

	@Override
	public String registerFootballer(Footballer footballer) throws Exception {
	   //set the values
		System.out.println("FootballerServiceImpl.registerFootballer()");
		System.out.println("Footballer Obj In Service Class(Before Save)::"+footballer);
		footballer.setCreateDate(LocalDateTime.now());
		Footballer savedFootballer = footballerRepo.save(footballer);
		System.out.println("Saved Footballer Object::"+savedFootballer);
		return "Footballer Saved With Id: "+savedFootballer.getPlayerId()+" And Name: "+savedFootballer.getPlayerName();
	}
	
	@Override
		public Optional<Footballer> getFootballerById(Integer id) throws Exception {
			return footballerRepo.findById(id);
		}
	@Override
		public Optional<Footballer> searchFootballerByName(String playerName) throws Exception {
			return footballerRepo.findByPlayerName(playerName);
		}
	@Override
		public Page<Footballer> showAllPlayerDetails(Pageable pageable) throws Exception {
			return footballerRepo.findAll(pageable);
		}
		

}
