package com.green.First;

public class OrderDTO {
  private String orderInfo;
  private  int count;
  private  String option;
  private  String text;
  private  String time;

  public String getOrderInfo() {
    return orderInfo;
  }

  public void setOrderInfo(String orderInfo) {
    this.orderInfo = orderInfo;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public String getOption() {
    return option;
  }

  public void setOption(String option) {
    this.option = option;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  @Override
  public String toString() {
    return "OrderDTO{" +
            "orderInfo='" + orderInfo + '\'' +
            ", count=" + count +
            ", option='" + option + '\'' +
            ", text='" + text + '\'' +
            ", time='" + time + '\'' +
            '}';
  }

  private  int lotto;

  public int getLotto() {
    return lotto;
  }




}


