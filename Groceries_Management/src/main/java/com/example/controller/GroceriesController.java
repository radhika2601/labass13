package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Groceries;
import com.example.service.GroceriesService;
@RestController
public class GroceriesController {
@Autowired
GroceriesService groceriesService;
@PostMapping("/groceries")
public Groceries addGroceries(@RequestBody Groceries groceries)
{
	System.out.println(groceries.getName());
	return groceriesService.addGroceries(groceries);
}
@GetMapping("/groceries")
public List<Groceries>findAllGroceries()
{
	return groceriesService.findAllGroceries();
}
@GetMapping("/groceries/{id}")
public Groceries findByid(@PathVariable int id)
{
	return groceriesService.findByid(id);
}
@GetMapping("/groceries/api/{name}")
public List<Groceries>findByname(@PathVariable String name)
{
	return groceriesService.findByname(name);
}
@DeleteMapping("/groceries/{id}")
public String deleteGroceries(@PathVariable int id)
{
	groceriesService.deleteGroceries(id);
	return "Groceries is delete";
}
@PutMapping("/groceries")
public Groceries updateGroceries(@RequestBody Groceries groceries)
{
	return groceriesService.updateGroceries(groceries);
}
}
