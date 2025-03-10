package com.green.board.mapper;

import com.green.board.dto.BoardDTO;
import com.green.board.dto.SearchDTO;
import com.green.board.service.BoardService;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {


  //게시글 목록 조회 쿼리
  public List<BoardDTO> BoardList(SearchDTO searchDTO);

  //상세 정보 조회 쿼리
  public BoardDTO selectBoard(int boardNum);

  //게시글 등록 쿼리
  public int insertBoard(BoardDTO boardDTO);

  //게시글 삭제 쿼리
  public int deleteBoard(int boardNum);

  //게시글 수정 쿼리
  public int updateBoard(BoardDTO boardDTO);

  //조회수 증가 쿼리
  public int updateReadCnt(int boardNum);

}
