package com.Spring.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Spring.models.register;

@Repository
@EnableJpaRepositories
public interface RegistersRepository extends JpaRepository<register,Integer> {
	
}
