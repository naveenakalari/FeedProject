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

	@Query("select f from Feed where topic=keyword")
	public List<Feed> getByKeyword(@Param("word") String keyword);
	
	public List<Feed> getByTopic(String topic);
    
    //public List<Feed> getByKeyword(String keyword);


	

	
	
	 

}

