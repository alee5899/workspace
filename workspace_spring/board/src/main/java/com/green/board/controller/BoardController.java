package com.green.board.controller;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/boards")
public class BoardController {
  private BoardService boardService;

  public BoardController(BoardService boardService) {
    this.boardService = boardService;
  }

  //게시글 목록 조회 API
  //(get)boards
  @GetMapping("")
  public List<BoardDTO> BoardList(SearchDTO searchDTO){
    System.out.println(searchDTO);
    return boardService.BoardList(searchDTO);

  }
//  public List<BoardDTO> BoardList(
//          @RequestParam("searchKeyword") String a,
//          @RequestParam("searchKeyword") String b) {
//    return boardService.BoardList();
//  }

  //(get)boards/1
  //게시글 상세조회 API
  @GetMapping("/{boardNum}")
  public BoardDTO selectBoard(@PathVariable("boardNum") int boardNum) {
    return boardService.selectBoard(boardNum);
  }

  //(POST) / boards
  //게시글 등록 API
  @PostMapping("")
  public int insertBoard(@RequestBody BoardDTO boardDTO) {
    return boardService.insertBoard(boardDTO);
  }

  //(delete)/boards/1
  //게시글 삭제 API
  @DeleteMapping("/{boardNum}")
  public int deleteBoard(@PathVariable("boardNum") int boardNum) {
    return boardService.deleteBoard(boardNum);
  }

  //게시글 업데이트 API
  //(PUT)localhost8080:boards/3
  @PutMapping("/{boardNum}")
  public int updateBoard(@PathVariable("boardNum") int boardNum, @RequestBody BoardDTO boardDTO) {
    boardDTO.setBoardNum(boardNum);
    return boardService.updateBoard(boardDTO);
  }
}
