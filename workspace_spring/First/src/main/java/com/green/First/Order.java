package com.green.First;

public class Order {
  private int orderNum;
  private  String clothesName;
  private int price;
  private int number; //수량
  private  String id;

  public Order(int orderNum, String clothesName, int price, int number, String id) {
    this.orderNum = orderNum;
    this.clothesName = clothesName;
    this.price = price;
    this.number = number;
    this.id = id;
  }

  public int getOrderNum() {
    return orderNum;
  }

  public void setOrderNum(int orderNum) {
    this.orderNum = orderNum;
  }

  public String getClothesName() {
    return clothesName;
  }

  public void setClothesName(String clothesName) {
    this.clothesName = clothesName;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}


