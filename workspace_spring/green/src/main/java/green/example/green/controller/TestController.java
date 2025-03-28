package green.example.green.controller;

import green.example.green.dto.TestDTO;
import green.example.green.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/test")
public class TestController {
  private final TestService testService;


  //목록 조회
  @GetMapping("")
  public List<TestDTO> selectTest(){
  return testService.selectTest();
  }

  //상세조회
  @GetMapping("/{num}")
  public TestDTO selectTest(@PathVariable("num") int num) {
    return testService.selectedTest(num);
  }
}
