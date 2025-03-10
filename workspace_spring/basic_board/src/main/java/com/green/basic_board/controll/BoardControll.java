package com.green.basic_board.controll;

import com.green.basic_board.dto.BoardDTO;
import com.green.basic_board.service.BoardService;
import org.apache.coyote.http11.filters.VoidOutputFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/boards")
public class BoardControll {
  private BoardService boardService;

  //만약,클래스 안에 생성자가 1개만 있으면
  //@Autowired를 생략해도 자동으로 @Autowired를 붙여준다
  @Autowired
  public BoardControll(BoardService boardService){
    this.boardService = boardService;
  }

  //게시글 목록 조회 기능을 제공하는 REST API
  //(get) localhost:8080/boards
  @GetMapping("")
  public List<BoardDTO> getBoardList(){
    return boardService.selectBoardList();
  }

  //게시글 하나의 정보를 조회하는 기능을 제공하는 REST API
  //(GET) localhost:8080/boards/3
  @GetMapping("/{boardNum}")
  public BoardDTO  getBoard(@PathVariable("boardNum")int boardNum){
    return boardService.getBoard(boardNum);

  }

  //(POST)localhost8080:/boards
  @PostMapping("")
  public int insertBoard(@RequestBody BoardDTO boardDTO){
    System.out.println(boardDTO);
    return boardService.insertBoard(boardDTO);
  }
}
