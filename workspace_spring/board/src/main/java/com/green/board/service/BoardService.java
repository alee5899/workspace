package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;

import java.util.List;

public interface BoardService {

  //게시글 목록 조회 기능
  public List<BoardDTO> BoardList(SearchDTO searchDTO);

  //상세 정보 조회 기능
  public BoardDTO selectBoard(int boardNum);

  //게시글 등록 기능
  public int insertBoard(BoardDTO boardDTO);

  //게시글 삭제 기능
  public int deleteBoard(int boardNum);

  //게시글 수정 기능
  public int updateBoard(BoardDTO boardDTO);


}
