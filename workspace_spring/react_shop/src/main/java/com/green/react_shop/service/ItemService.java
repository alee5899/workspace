package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;

import java.util.List;

public interface ItemService {

  //조회하는 기능
  public List<ItemDTO> ItemList();

  //상세조회 쿼리

  public ItemDTO selectItem(int itemNum);

  //등록 쿼리
  public int insertItem(ItemDTO itemDTO);
}
