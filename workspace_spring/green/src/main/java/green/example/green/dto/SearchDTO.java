package green.example.green.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SearchDTO {
  private String selectWord;
  private String searchLog;
}
