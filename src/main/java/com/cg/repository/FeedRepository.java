package com.cg.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.entity.Feed;

@Repository
public interface FeedRepository extends JpaRepository<Feed,Integer> {

	
	public List<Feed> getById(int feedId);
	
	public List<Feed> getByTopic(String topic);
    
    //public List<Feed> getByKeyword(String keyword);

	//List<Feed> findByKeywordsIn(List<String> keywords);
	
	//@Query("select f from Feed where topic like '%:word%' ")
	//public List<Feed> getByKeyword(@Param("word") String keyword);
	 

}

