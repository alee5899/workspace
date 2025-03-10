package com.green.shop.controller;

import com.green.shop.dto.ItemDTO;
import com.green.shop.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
  private ItemService itemService;

  public ItemController(ItemService itemService){
    this.itemService = itemService;

  }
  // 상품하나를 등록하는 기능 API
  @PostMapping("")
  public void regItem(@RequestBody ItemDTO itemDTO){
    System.out.println(itemDTO);
    //매개변수에는 ItemDTO 자료형 들어와야함
    //매개변수로 쿼리의 빈 값을 채워 준다

    //->상품명,상품가격,상품설명 3개 데이터가
    //들어있는 ItemDTO 객체를 매개변수로 전달해야한다
    itemService.insertItem(itemDTO);
  }
  //모든 상품의 상품번호,상품명,가격 상품등록일을 조회하는기능
  @GetMapping("")
  public List<ItemDTO>  getItemList(){
    return itemService.selectItemList();
  }

  //localhost8080//items/3
  @GetMapping("/{itemCode}")
  public ItemDTO getItem(@PathVariable("itemCode") int itemCode){
    return itemService.selectItem(itemCode);
  }

  //localhost:8080/items/5
  @DeleteMapping("/{itemCode}")
  public void deleteItem(@PathVariable("itemCode") int itemCode){
    itemService.deleteItem(itemCode);
  }
  //localhost:8080/items/update
  @PostMapping("/{update}")
  public void updateItem(@RequestBody ItemDTO itemDTO){
    itemService.updateItem(itemDTO);
  }

  //(put)localhost:8080/items/3
  @PutMapping("/{itemCode}")
  public void updateItem2(@PathVariable("itemCode") int itemCode, @RequestBody ItemDTO itemDTO){
    itemDTO.setItemCode((itemCode));
    itemService.updateItem(itemDTO);

  }
}
