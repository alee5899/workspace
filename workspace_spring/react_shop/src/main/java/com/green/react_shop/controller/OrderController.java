package com.green.react_shop.controller;

import com.green.react_shop.dto.OrderDTO;
import com.green.react_shop.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/orders")
public class OrderController {
  private final OrderService orderService;

  //주문등록
  @PostMapping("")
  public void insertOrder(@RequestBody OrderDTO orderDTO) {
    orderService.insertOrder(orderDTO);
  }
  @GetMapping("")
  public List<OrderDTO> orderList(){
    return orderService.orderList();
  }
}
