package green.example.green.mapper;

import green.example.green.dto.SearchDTO;
import green.example.green.dto.TestDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TestMapper {

  //조회
  public List<TestDTO> selectTest();

  //상세 정보 조회
  public TestDTO selectedTest(int num);
  }
