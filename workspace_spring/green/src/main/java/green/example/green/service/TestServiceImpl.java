package green.example.green.service;

import green.example.green.dto.SearchDTO;
import green.example.green.dto.TestDTO;
import green.example.green.mapper.TestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TestServiceImpl implements TestService{
private final TestMapper testMapper;

  @Override
  public List<TestDTO> selectTest() {
    return testMapper.selectTest();
  }

  @Override
  public TestDTO selectedTest(int num) {
    return testMapper.selectedTest(num);
  }


}
