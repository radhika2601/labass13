package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.model.Groceries;
import com.example.repository.GroceriesRepository;
import com.example.service.GroceriesService;
@Repository
public class GroceriesServiceImpl implements GroceriesService{
	@Autowired
GroceriesRepository groceriesRepository;
	@Override
public Groceries addGroceries(Groceries groceries)
{
	return groceriesRepository.save(groceries);
}
	@Override
	public List<Groceries>findAllGroceries(){
	return groceriesRepository.findAll();
}
	@Override
	public void deleteGroceries(int id)
	{
		groceriesRepository.deleteById(id);
	}
	@Override
	public Groceries updateGroceries(Groceries groceries) {
		// TODO Auto-generated method stub
		Groceries _groceries=groceriesRepository.findById(groceries.getId()).get();
		_groceries.setId(groceries.getId());
		_groceries.setName(groceries.getName());
		_groceries.setPrice(groceries.getPrice());
		_groceries.setQuantity(groceries.getQuantity());
		return groceriesRepository.save(_groceries);
	}

	@Override
	public Groceries findByid(int id) {
		// TODO Auto-generated method stub
		return groceriesRepository.findById(id).get();
	}

	@Override
	public List<Groceries> findByname(String name) {
		// TODO Auto-generated method stub
				return groceriesRepository.findByname(name);
			}
	}

