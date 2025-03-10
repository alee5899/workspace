package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface MemberService {
  //회원목록 조회 기능
  public List<MemberDTO> selectMemberList();


  //회원 상세 정보 조회 기능
  public MemberDTO findMemberByMemID(String memId);

  //회원등록 기능
  public int insertMember(MemberDTO memberDTO);

  //회원삭제 기능
  public  void  deleteMember(String memId);

  //회원 수정 기능
  public  void  updateMember(MemberDTO memberDTO);
}
