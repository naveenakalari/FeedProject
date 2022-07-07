package com.cg.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Feed;
import com.cg.exception.FeedNotFoundException;
import com.cg.repository.FeedRepository;

@Service
public class FeedService {
	
	@Autowired
	private FeedRepository feedRepository;
	
	public String addFeed(Feed feed)
	{
		feedRepository.save(feed);
		return "Feedback is added";	
	}
		
	public Feed editComment(int feedId, int totalcomments)
	{
		Feed feed= feedRepository.findById(feedId).get();
		feed.setTotalComments(totalcomments);
		return feedRepository.save(feed);

	}
	
	public List<Feed> likeFeed(int feedId, int relevance)
	{
		if(!feedRepository.existsById(feedId))
		{
			throw new FeedNotFoundException();
		}
		Feed feed = feedRepository.findById(feedId).get();
		feed.setRelevance(relevance);
		feedRepository.flush();
		return feedRepository.findAll();
	}
	
	
	 public List<Feed> getById(int feedId) 
	 {
		return feedRepository.getById(feedId);
	  
	 }
	 
	 public List<Feed> deleteById(int feedId)
	 {
		 feedRepository.deleteById(feedId);
		 return feedRepository.findAll();
	 }
	 
	 
	public Optional<Feed> getFeedsByDeveloper(int devId)
	 {
		 return feedRepository.findById(devId);
		 
	 }
	
	/*public List<Feed> getFeedsByKeyword(String keyword)
	 {
		
		 return feedRepository.getByKeyword(keyword);
		 
	 }*/
	
	
	public List<Feed> getFeedsByTopic(String topic)
	{
		return  feedRepository.getByTopic(topic);
	}

	
	
	 
	 
	 
	

}