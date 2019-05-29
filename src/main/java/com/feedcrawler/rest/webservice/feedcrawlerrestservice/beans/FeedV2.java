package com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans;

public class FeedV2 {

	private FeedTitle title;

	public FeedV2(FeedTitle title) {
		super();
		this.title = title;
	}

	public FeedTitle getTitle() {
		return title;
	}

	public void setTitle(FeedTitle title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "FeedV2 [title=" + title + "]";
	}

	
}
