package edu.gmu.hackthon.dao;

import edu.gmu.hackthon.model.person.Food;

import java.util.List;

public interface FoodDao {
    List<Food> gerNearbyFood();
    boolean updateFood(Food food);
    boolean createFood(Food food);
}
