package com.test.service;

import java.util.List;

import com.test.entity.Fruit;

public interface FruitService {
	public  Fruit createFruit(Fruit fru);
	
	public List<Fruit> readAllFruits();
	
	public List<Fruit> updateFruits(Fruit fru);
	
	public List<Fruit> deleteFruit(int id);

}
