package com.green.rest.controller;

import com.green.rest.dto.ItemDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/items")
public class ItemController {
  //1.모든 상품을 조회하는 기능을 제공하는 REST API
  @GetMapping("")
  public void getItem(){
    log.info("상품 조회");
  }
  //2.상품 하나를 조회하는 기능을 제공하는 REST API
  @GetMapping("/{itemCode}")
  public void getOneItem(@PathVariable("itemCode")int itemCode){
    log.info("상품 하나 조회");
    log.info("itemCode = " + itemCode);
  }
  //3.상품 하나를 등록하는 기능을 제공하는 REST API
  @PostMapping("")
  public void getNewItem(@RequestBody ItemDTO itemDTO){
    log.info("상품등록");
    log.info("getNewItem = " + itemDTO);
  }
  //4.상품 하나를 삭제하는 기능을 제공하는 REST API
  @DeleteMapping("/{itemCode}")
  public void itemDelete(@PathVariable("itemCode")int itemCode){
    log.info("상품 삭제");
    log.info("itemCode = " + itemCode);
  }

  //5.상품 하나의 상품명과 가격,색상을 변경하는 기능 제공 REST API
  @PutMapping("/{itemCode}")
  public void itemUpdate(@PathVariable("itemCode")int itemCode, @RequestBody ItemDTO itemDTO){
    log.info("itemCode = " + itemCode);
    log.info("item = " +   itemDTO);
    ;
  }
}
