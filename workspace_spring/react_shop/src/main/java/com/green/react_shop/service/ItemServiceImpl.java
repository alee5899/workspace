package com.green.react_shop.service;

import com.green.react_shop.dto.ItemDTO;
import com.green.react_shop.mapper.ItemMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService{
  private final ItemMapper itemMapper;



  @Override
  public int insertItem(ItemDTO itemDTO) {
    return itemMapper.insertItem(itemDTO);
  }



  @Override
  public List<ItemDTO> ItemList() {
    return itemMapper.ItemList();
  }

  //등록
  @Override
  public ItemDTO selectItem(int itemNum) {
    return itemMapper.selectItem(itemNum);
  }

}
