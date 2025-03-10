package com.green.rest_test.controller;

import com.green.rest_test.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/orders")
public class OrederController {
//1) 모든주문정보를조회하는기능을제공하는 RESTAPI
  @GetMapping("")
  public List<OrderDTO> getOrder() {
    List<OrderDTO> orderDTOList = new ArrayList<>();

    orderDTOList.add(new OrderDTO(1, "상품1", 1000, 5, "A"));
    orderDTOList.add(new OrderDTO(2, "상품2", 2000, 5, "B"));
    orderDTOList.add(new OrderDTO(3, "상품3", 3000, 10, "C"));
    orderDTOList.add(new OrderDTO(4, "상품4", 4000, 20, "D"));
    orderDTOList.add(new OrderDTO(5, "상품5", 5000, 3, "E"));

    log.info("모든 주문정보 조회");
    return orderDTOList;
  }

  // 2) 하나의 주문 정보를 조회하는 기능을 제공하는 REST API
  @GetMapping("/{itemNumber}")
  public void getOrder(@PathVariable("itemNumber") int itemNumber) {
    log.info("하나의 주문정보 조회");
    log.info("itemNumber = " + itemNumber);


  }

  // 3) 하나의 주문 정보를 등록하는 기능을 제공하는 REST API
  @PostMapping("")
  public void newItem(@RequestBody OrderDTO orderDTO) {
    log.info("주문등록");
    log.info("newItem = " + orderDTO);
  }

  // 4) 하나의 주문 정보를 삭제하는 기능을 제공하는 REST API
  @DeleteMapping("/{itemNumber}")
  public void deleteOrder(@PathVariable("itemNumber") int itemNumber) {
    log.info("주문삭제");
    log.info(" itemNumber = " + itemNumber);
  }

  // 5) 하나의 주문 정보에서 상품명과 상품가격을 수정하는 기능을 제공하는 REST API
  @PutMapping("/{itemNumber}")
  public void updateOrder(@PathVariable("itemNumber")int itemNumber,OrderDTO orderDTO) {
    log.info("주문정보 수정");
    log.info("itemNumber = " + itemNumber);
    log.info("수정된 주문 = " + orderDTO);
  }
}
