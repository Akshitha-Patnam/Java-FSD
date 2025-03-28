package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.test.entity.Customer;

import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

//@Repository
@Transactional
public interface CustomerRepository extends JpaRepository<Customer, Integer>
{

}
