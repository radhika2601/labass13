package com.example.service;

import java.util.List;

import com.example.model.Groceries;

public interface GroceriesService {
Groceries addGroceries(Groceries groceries);
List<Groceries>findAllGroceries();
void deleteGroceries(int id);
Groceries updateGroceries(Groceries groceries);
Groceries findByid(int id);
List<Groceries>findByname(String name);
}
