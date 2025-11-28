/*package com.klef.fsad.sdp.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "transaction_table")
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "transactionid")
	private int transactionId;
	
	@Column(nullable = false, name = "bookId")
    private int bookId;
	
	@Column(nullable = false, name = "userId")
    private int userId;
	
	@Column(nullable = false, name = "issueDate")
    private LocalDate issueDate;
	
	@Column(nullable = false, name = "dueDate")
    private LocalDate dueDate;
	
	@Column(nullable = false, name = "returnDate")
    private LocalDate returnDate;
    
	public int getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public LocalDate getIssueDate() {
		return issueDate;
	}
	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}
	public LocalDate getDueDate() {
		return dueDate;
	}
	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	public LocalDate getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(LocalDate returnDate) {
		this.returnDate = returnDate;
	}
	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", bookId=" + bookId + ", userId=" + userId
				+ ", issueDate=" + issueDate + ", dueDate=" + dueDate + ", returnDate=" + returnDate + "]";
	}
    
    

}

*/