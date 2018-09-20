package com.greanfox.foxclub.modle;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Fox {
  private String name;
  private String drinkType;
  private String foodType;
  List<String> triks = new ArrayList<>();

  public Fox(String name, String drinkType, String foodType, List<String> triks) {
    this.name = name;
    this.drinkType = drinkType;
    this.foodType = foodType;
    this.triks = triks;
  }

  public Fox() {

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDrinkType() {
    return drinkType;
  }

  public void setDrinkType(String drinkType) {
    this.drinkType = drinkType;
  }

  public String getFoodType() {
    return foodType;
  }

  public void setFoodType(String foodType) {
    this.foodType = foodType;
  }

  public List<String> getTriks() {
    return triks;
  }

  public void setTriks(List<String> triks) {
    this.triks = triks;
  }

}
