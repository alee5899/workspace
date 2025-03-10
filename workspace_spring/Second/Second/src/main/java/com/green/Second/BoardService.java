package com.green.Second;

import org.springframework.stereotype.Component;

//BoardService boardService = new BoardService();
@Component("service")
public class BoardService {
  public void bbb(){
    System.out.println("bbb 메소드 실행");
  }
}
