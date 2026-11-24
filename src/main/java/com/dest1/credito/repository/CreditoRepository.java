package com.dest1.credito.repository;

import com.dest1.credito.entities.Credito;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditoRepository extends JpaRepository<Credito, Integer> {

}