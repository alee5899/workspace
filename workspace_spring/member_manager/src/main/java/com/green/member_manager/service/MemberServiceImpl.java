package com.green.member_manager.service;

import com.green.member_manager.dto.MemberDTO;
import com.green.member_manager.mapper.MemberMapper;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService{
  //MemberMapper 객체 필요.
  private MemberMapper memberMapper;


  public MemberServiceImpl(MemberMapper memberMapper){
    this.memberMapper = memberMapper;
  }

  //회원목록 조회 기능
  @Override
  public List<MemberDTO> selectMemberList() {
    //회원 목록 조회 쿼리 실행

    return memberMapper.selectMemberList();
  }

  @Override
  public MemberDTO findMemberByMemID(String memId) {
    return memberMapper.findMemberByMemID(memId);
  }

  //회원등록기능
  @Override
  public int insertMember(MemberDTO memberDTO) {
    return memberMapper.insertMember(memberDTO);
  }

  @Override
  public void deleteMember(String memId) {
    memberMapper.deleteMember(memId);

  }

  @Override
  public void updateMember(MemberDTO memberDTO) {
    memberMapper.updateMember(memberDTO);
  }
}






