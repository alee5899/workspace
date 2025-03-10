package com.green.react_shop.controller;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("items")
public class ItemController {
  private final ItemService itemService;


  //등록 API
  @PostMapping("")
  public int insertItem(@RequestBody ItemDTO itemDTO) {
    return  itemService.insertItem(itemDTO);
  }

  //목록 조회 API
  @GetMapping("")
  public List<ItemDTO> getList(){
    return itemService.ItemList();
  }

  //상세조회 API

  @GetMapping("/{itemNum}")
  public ItemDTO selectItem(@PathVariable("itemNum") int itemNum) {
    return itemService.selectItem(itemNum);
  }


}