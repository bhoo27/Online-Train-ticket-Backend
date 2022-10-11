package com.payment.repostitory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.payment.entity.Payment;
@Repository
public interface PaymentRepository extends MongoRepository<Payment, String> {

	Object findBypassengerId(String passengerId);


}
