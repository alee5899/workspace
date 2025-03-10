package com.green.board.controller;

import com.green.board.dto.ReplyDTO;
import com.green.board.dto.TestDTO;
import com.green.board.service.ReplyService;
import org.springframework.web.bind.annotation.*;

import javax.naming.Name;
import java.util.List;

@RestController
@RequestMapping("/replies")
public class ReplyController {
  private ReplyService replyService;

  public ReplyController(ReplyService replyService) {
    this.replyService = replyService;
  }

  //댓글 목록 조회 api
  //(get) localhost:8080/replies/3
  @GetMapping("/{boardNum}")
  public List<ReplyDTO> getReplyList(@PathVariable("boardNum") int boardNum){
    return replyService.getList(boardNum);
  }

  //댓글 등록 api
  //(post)localhost:8080/replies
  @PostMapping("")
  public void insertReply(@RequestBody ReplyDTO replyDTO) {
   replyService.insertReply(replyDTO);
  }

  //댓글 삭제 api
  //(delete)localhost:8080/replies/3
  @DeleteMapping("/{replyNum}")
  public void deleteReply(@PathVariable("replyNum") int replyNum){
    replyService.deleteReply(replyNum);
  }

//  @GetMapping("/test")
//  public void test(@RequestParam("age") int age,@RequestParam("name") String name){
//    System.out.println("age = " + age);
//    System.out.println("name = " + name);
//
//  }

  @GetMapping("/test")
  public void test(TestDTO testDTO){
    System.out.println(testDTO);
  }
}
