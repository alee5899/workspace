package com.green.board.service;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements  BoardService{
  private BoardMapper boardMapper;

  public BoardServiceImpl(BoardMapper boardMapper){
    this.boardMapper = boardMapper;
  }


  //게시글 목록 조회 쿼리
  @Override
  public List<BoardDTO> BoardList(SearchDTO searchDTO) {
    return boardMapper.BoardList(searchDTO);
  }

  //게시글 상세 조회 기능
  @Override
  public BoardDTO selectBoard(int boardNum) {
    //조회수 증가 쿼리실행
    boardMapper.updateReadCnt(boardNum);
    //상세 정보 조회 쿼리
    return boardMapper.selectBoard(boardNum);
  }

  //게시글 등록 쿼리
  @Override
  public int insertBoard(BoardDTO boardDTO) {
    return boardMapper.insertBoard(boardDTO);
  }

  //게시글 삭제 쿼리
  @Override
  public int deleteBoard(int boardNum) {
    return boardMapper.deleteBoard(boardNum);
  }

  //게시글 수정` 쿼리
  @Override
  public int updateBoard(BoardDTO boardDTO) {
    return boardMapper.updateBoard(boardDTO);
  }
}
