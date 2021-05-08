package com.cts.training.repository;

import com.cts.training.bean.*;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRespository extends JpaRepository<Skills,Long> {

	

	Optional<Skills> findByLevel(String level);

	//Optional<Skills> findByAddress(String level);

	

	//Optional<Skills> findByAddress(String address);

}
