package com.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.dao.FruitDao;
import com.test.entity.Fruit;
import com.test.repository.FruitRepository;

@Repository
public class FruitDaoimpl implements FruitDao {

	@Autowired
	private FruitRepository repository;

	@Override
	public Fruit createFruit(Fruit fru) {
		return repository.save(fru);
	}

	@Override
	public List<Fruit> readAllFruits() {

		return repository.findAll();
	}

	@Override
	public List<Fruit> updateFruits(Fruit Fru) {
		
		return repository.findAll();
	}

	@Override
	public List<Fruit> deleteFruit(int id) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	
}
