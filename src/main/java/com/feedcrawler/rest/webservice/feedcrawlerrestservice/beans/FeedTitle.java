package com.feedcrawler.rest.webservice.feedcrawlerrestservice.beans;

public class FeedTitle {

	private String titleBody;
	private String titleSubBody;
	
	public FeedTitle(String titleBody, String titleSubBody) {
		super();
		this.titleBody = titleBody;
		this.titleSubBody = titleSubBody;
	}
	
	public String getTitleBody() {
		return titleBody;
	}
	public void setTitleBody(String titleBody) {
		this.titleBody = titleBody;
	}
	public String getTitleSubBody() {
		return titleSubBody;
	}
	public void setTitleSubBody(String titleSubBody) {
		this.titleSubBody = titleSubBody;
	}

	@Override
	public String toString() {
		return "FeedTitile [titleBody=" + titleBody + ", titleSubBody=" + titleSubBody + "]";
	}
	
	
}
