package com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans;

public class FeedV1 {

	private String title;

	public FeedV1(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "FeedV1 [title=" + title + "]";
	}
	
}
