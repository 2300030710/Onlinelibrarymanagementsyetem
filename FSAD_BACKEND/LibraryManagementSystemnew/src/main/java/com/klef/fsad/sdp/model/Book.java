/*package com.klef.fsad.sdp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "book_table")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "bookId")
	private int bookId;
	
	@Column(nullable = false, name = "title")
	private String Title;
	
	@Column(nullable = false, name = "author")
	private String Author;
	
	@Column(nullable = false, name = "isbn")
	private String ISBN;
	
	@Column(nullable = false, name = "published_year")
	private int PublishedYear;
	
	@Column(nullable = false, name = "genre")
	private String Genre;
	
	@Column(nullable = false, name = "availability")
	private boolean availability;
	
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public int getPublishedYear() {
		return PublishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		PublishedYear = publishedYear;
	}
	public String getGenre() {
		return Genre;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public boolean isAvailability() {
		return availability;
	}
	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Book [Title=" + Title + ", Author=" + Author + ", ISBN=" + ISBN + ", PublishedYear=" + PublishedYear
				+ ", Genre=" + Genre + ", availability=" + availability + "]";
	}
	
	
	
	
	


}
*/
