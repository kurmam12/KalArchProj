package com.cog.pract.payment.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Payments")
public class Payments {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "payment_id")
	private String  paumentId;	
	
	@Column(name = "payment_type")
	private String paymentType ;
	
	@Column(name = "payment_date")
	private Date  pymentDate ;
	
	@Column(name ="payment_status")
	private String paymentStatus;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaumentId() {
		return paumentId;
	}

	public void setPaumentId(String paumentId) {
		this.paumentId = paumentId;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Date getPymentDate() {
		return pymentDate;
	}

	public void setPymentDate(Date pymentDate) {
		this.pymentDate = pymentDate;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public Payments(Long id, String paumentId, String paymentType, Date pymentDate, String paymentStatus) {
		super();
		this.id = id;
		this.paumentId = paumentId;
		this.paymentType = paymentType;
		this.pymentDate = pymentDate;
		this.paymentStatus = paymentStatus;
	}
	
	

}
