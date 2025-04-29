package com.cs.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cs.model.Footballer;

public interface IFootballerRepository extends JpaRepository<Footballer, Integer> {
	public Optional<Footballer> findByPlayerName(String playerName) throws Exception;
}
