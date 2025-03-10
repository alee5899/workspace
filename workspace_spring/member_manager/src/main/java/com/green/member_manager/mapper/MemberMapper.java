package com.green.member_manager.mapper;

import com.green.member_manager.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

//데이터(변수), 기능(메서드)

//MemberMapper memberMapper = new MemberMapper();
@Mapper
public interface MemberMapper {
  //회원목록 조회 쿼리
  public List<MemberDTO> selectMemberList();

  public MemberDTO findMemberByMemID(String memId);

  //회원등록 쿼리
  public int insertMember(MemberDTO memberDTO);

  //회원 삭제 쿼리
  public  void  deleteMember(String memId);

  //회원 수정 쿼리
  public  void  updateMember(MemberDTO memberDTO);
}
