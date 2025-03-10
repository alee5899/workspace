package com.green.board.service;

import com.green.board.dto.ReplyDTO;
import com.green.board.mapper.ReplyMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReplyServiceImpl implements ReplyService{
  private ReplyMapper replyMapper;

  public ReplyServiceImpl(ReplyMapper replyMapper) {
    this.replyMapper = replyMapper;
  }

  //댓글 목록 조회
  @Override
  public List<ReplyDTO> getList(int boardNum) {
    return replyMapper.getList(boardNum);
  }

  @Override
  public void insertReply(ReplyDTO replyDTO) {
    replyMapper.insertReply(replyDTO);
  }

  @Override
  public void deleteReply(int replyNum) {
    replyMapper.deleteReply(replyNum);

  }
}
