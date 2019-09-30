package com.metacube.rest.model;

public class BookModel {

	String title;
	String writer;
	String publisher;
	String publishedYear;

	public BookModel(String title, String writer, String publisher, String publishedYear) {
		super();
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.publishedYear = publishedYear;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public String getPublisher() {
		return publisher;
	}

	public String getPublishedYear() {
		return publishedYear;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}

}
