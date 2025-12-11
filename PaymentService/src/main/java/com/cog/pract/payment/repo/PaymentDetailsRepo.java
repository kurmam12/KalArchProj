package com.cog.pract.payment.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cog.pract.payment.model.Payments;

public interface PaymentDetailsRepo extends JpaRepository<Payments, Long>{
	
	Optional<Payments> findById(Long id);

}
