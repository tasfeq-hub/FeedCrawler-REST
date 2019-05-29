package com.feedcrawler.rest.webservice.feedcrawlerrestservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

	
}
