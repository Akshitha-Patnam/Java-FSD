package com.test.dao;

import java.util.List;

import com.test.entity.Fruit;

public interface FruitDao {
	
public  Fruit createFruit(Fruit fru);
	
	public List<Fruit> readAllFruits();
	
	public List<Fruit> updateFruits(Fruit Fru);
	
	public List<Fruit> deleteFruit(int id);

}
