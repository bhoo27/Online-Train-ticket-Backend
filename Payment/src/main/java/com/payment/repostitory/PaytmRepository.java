package com.payment.repostitory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.payment.entity.Paytm;
@Repository
public interface PaytmRepository extends MongoRepository<Paytm, String>{

}
