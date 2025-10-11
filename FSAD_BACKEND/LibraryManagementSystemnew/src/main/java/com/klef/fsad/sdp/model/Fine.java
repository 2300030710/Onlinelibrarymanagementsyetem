/*package com.klef.fsad.sdp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fine_table")
public class Fine {
	
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "fineid")
	    private int fineId;
	   
	   @Column(nullable = false, name = "userId")
	    private int userId;
	   
	   @Column(nullable = false, name = "transactionId",unique = true)
	    private int transactionId;
	   
	   @Column(nullable = false, name = "amount")
	    private double amount;
	   
	   @Column(nullable = false, name = "isPaid")
	    private boolean isPaid;
	    
		public int getFineId() {
			return fineId;
		}
		public void setFineId(int fineId) {
			this.fineId = fineId;
		}
		public int getUserId() {
			return userId;
		}
		public void setUserId(int userId) {
			this.userId = userId;
		}
		public int getTransactionId() {
			return transactionId;
		}
		public void setTransactionId(int transactionId) {
			this.transactionId = transactionId;
		}
		public double getAmount() {
			return amount;
		}
		public void setAmount(double amount) {
			this.amount = amount;
		}
		public boolean isPaid() {
			return isPaid;
		}
		public void setPaid(boolean isPaid) {
			this.isPaid = isPaid;
		}
		@Override
		public String toString() {
			return "Fine [fineId=" + fineId + ", userId=" + userId + ", transactionId=" + transactionId + ", amount="
					+ amount + ", isPaid=" + isPaid + "]";
		}
	    
		

}
*/
