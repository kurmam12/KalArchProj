package com.cog.pract.payment.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cog.pract.payment.model.Payments;
import com.cog.pract.payment.service.ExternalSericeCaller;
import com.cog.pract.payment.service.PaymentDetailsService;

@RestController
@RequestMapping("/payments")
public class PaymentDtailsController {
	
	@Autowired
	PaymentDetailsService paymentDetailsServce;
	private final ExternalSericeCaller serviceCaller;

	public PaymentDtailsController(PaymentDetailsService paymentDetailsServce, ExternalSericeCaller serviceCaller) {
		
		this.serviceCaller = serviceCaller;
		this.paymentDetailsServce = paymentDetailsServce;
	}
	
	@GetMapping("/payments/{id}") // Corrected path to include the ID variable
    public ResponseEntity<Payments> getPaymentById(@PathVariable("id") Long id) {
		// 1. Call the service to get the Optional<Payments>
        Optional<Payments> paymentOptional = paymentDetailsServce.getPaymntId(id);

        // 2. Check if the Optional contains a value
        if (paymentOptional.isPresent()) {
            // 3. If found, return the payment object with HTTP Status 200 (OK)
            return new ResponseEntity<>(paymentOptional.get(), HttpStatus.OK);
        } else {
            // 4. If not found, return an empty body with HTTP Status 404 (NOT_FOUND)
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
        // Alternative concise return using map/orElseGet (requires Java 8+)
        // return paymentOptional.map(payment -> new ResponseEntity<>(payment, HttpStatus.OK))
        //                       .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    } 
	
	@GetMapping("/resilient-call")
    public String makeResilientCall() {
        return serviceCaller.callExternalService();
    }
	

}
