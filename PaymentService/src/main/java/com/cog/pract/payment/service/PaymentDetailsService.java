package com.cog.pract.payment.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cog.pract.payment.model.Payments;
import com.cog.pract.payment.repo.PaymentDetailsRepo;

@Service
public class PaymentDetailsService {
	@Autowired
	 PaymentDetailsRepo paymentDetailsRepo;

	public PaymentDetailsService(PaymentDetailsRepo paymentDetailsRepo) {		
		this.paymentDetailsRepo = paymentDetailsRepo;
	}
	
	
	  public Optional<Payments> getPaymntId(Long id) { 
		  return paymentDetailsRepo.findById(id); 
		  }
	 
	 
	 

}
