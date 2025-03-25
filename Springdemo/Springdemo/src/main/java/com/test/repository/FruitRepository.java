package com.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.entity.Fruit;

public interface FruitRepository extends JpaRepository<Fruit, Integer>{

}
