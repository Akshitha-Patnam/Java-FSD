package com.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.dao.FruitDao;
import com.test.entity.Fruit;
import com.test.service.FruitService;

public class FruitServiceImpl implements FruitService {

	@Autowired
	private FruitDao fruitDao;
	
	public void setFruitDao(FruitDao fruitDao) {
		this.fruitDao= fruitDao;
	}
	
	@Override
	
	public Fruit createFruit(Fruit fru) {
	try {
		if(fru!=null)
		{
			fruitDao.createFruit(fru);
		}
	}
	catch(RuntimeException e) {
		e.printStackTrace();
	}
	return fru;
	}

	@Override
	public List<Fruit> readAllFruits() {
		List<Fruit> list=fruitDao.readAllFruits();
		if(list.size()<0)
		{
			System.out.println("no content");
		}
		return list;
	}

	@Override
	public List<Fruit> updateFruits(Fruit fru) {
		try {
			if(fru!=null)
			{
				fruitDao.updateFruits(fru);
			}
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		return fruitDao.readAllFruits();
	}

	@Override
	public List<Fruit> deleteFruit(int id) {
		
		try {
			if(id != 0)
			{
				fruitDao.deleteFruit(id);
			}
			
		}	
		catch(RuntimeException e) {
			e.printStackTrace();
			
		}
		return fruitDao.readAllFruits();
	}	
}
