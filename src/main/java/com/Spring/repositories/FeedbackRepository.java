package com.Spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.models.feedback;


public interface FeedbackRepository extends JpaRepository<feedback,Integer>{

}
