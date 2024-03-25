package hei.school.soratra.endpoint;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Response implements Serializable {
  private String original_url;
  private String transformed_url;
}
