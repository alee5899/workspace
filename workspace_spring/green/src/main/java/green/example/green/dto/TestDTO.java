package green.example.green.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class TestDTO {
  private int num;
  private String title;
  private String writer;
  private String content;
  private  int views;
  private LocalDateTime date;
}
