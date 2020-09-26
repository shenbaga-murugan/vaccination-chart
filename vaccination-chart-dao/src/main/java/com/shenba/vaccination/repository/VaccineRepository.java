package com.shenba.vaccination.repository;

import com.shenba.vaccination.domain.Vaccine;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VaccineRepository extends MongoRepository<Vaccine, String> {
}
