package com.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.Spring.models.Users;

@Repository
@EnableJpaRepositories
public interface UsersRepo extends JpaRepository<Users,Integer> 
{

}
