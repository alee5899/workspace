package com.green.react_shop.mapper;

import com.green.react_shop.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ItemMapper {

  //등록 쿼리
  public int insertItem(ItemDTO itemDTO);

  //상세조회 쿼리
  public ItemDTO selectItem(int itemNum);


  //조회하는 쿼리
  public List<ItemDTO> ItemList();
}
