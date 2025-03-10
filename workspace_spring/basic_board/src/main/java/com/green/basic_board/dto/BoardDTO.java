package com.green.basic_board.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
@Setter
@Getter
@ToString
public class BoardDTO {
  private int boardNUM;
  private String title;
  private String writer;
  private  String content;
  private  int readCnt;
  private Timestamp createData;
}
