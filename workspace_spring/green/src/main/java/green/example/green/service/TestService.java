package green.example.green.service;

import green.example.green.dto.TestDTO;

import java.util.List;

public interface TestService {
  //조회
  public List<TestDTO> selectTest();

  //상세 정보 조회 쿼리
  public TestDTO selectedTest(int num);
}
