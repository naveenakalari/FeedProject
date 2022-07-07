package com.cg.entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Feed {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int feedId;
	
	@Column(name="query")
	private String query;
	
	@JsonFormat(pattern="yyyy-MM-dd")
	@Column(name="date")
	private LocalDate feedDate;
	
	@JsonFormat(pattern="HH:MM")
	@Column(name="time")
	private LocalTime feedTime;
	
	@Column(name="topic")
	private String topic;
	
	@Column(name="relevance")
	private int relevance;
	
	
	  //@Column(name="developer") private Developer developer;
	  
	 //@Column(name="response") private List<Response> responses;
	 
	
	@Column(name="totalComments")
	private int totalComments;
	
	/* @Column(name="keywords")
	 private List<String> keywords; */
	
	 public Feed() {}
	 public Feed(String query, LocalDate feedDate, LocalTime feedTime, String topic, int relevance, int totalComments) {
		super();
		this.query = query;
		this.feedDate = feedDate;
		this.feedTime = feedTime;
		this.topic = topic;
		this.relevance = relevance;
		this.totalComments = totalComments;
		//this.keywords = keywords;
	}
	public int getFeedId() {
		return feedId;
	}
	public void setFeedId(int feedId) {
		this.feedId = feedId;
	}
	public String getQuery() {
		return query;
	}
	public void setQuery(String query) {
		this.query = query;
	}
	public LocalDate getFeedDate() {
		return feedDate;
	}
	public void setFeedDate(LocalDate feedDate) {
		this.feedDate = feedDate;
	}
	public LocalTime getFeedTime() {
		return feedTime;
	}
	public void setFeedTime(LocalTime feedTime) {
		this.feedTime = feedTime;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public int getRelevance() {
		return relevance;
	}
	public void setRelevance(int relevance) {
		this.relevance = relevance;
	}
	public int getTotalComments() {
		return totalComments;
	}
	public void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}
	/*public List<String> getKeywords() {
		return keywords;
	}
	public void setKeywords(List<String> keywords) {
		this.keywords = keywords;
	}*/
	@Override
	public String toString() {
		return "Feed [feedId=" + feedId + ", query=" + query + ", feedDate=" + feedDate + ", feedTime=" + feedTime
				+ ", topic=" + topic + ", relevance=" + relevance + ", totalComments=" + totalComments + "]";
	}

	
}