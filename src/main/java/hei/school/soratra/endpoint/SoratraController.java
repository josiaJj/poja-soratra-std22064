package hei.school.soratra.endpoint;

import hei.school.soratra.service.event.SoratraService;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class SoratraController {
  private final SoratraService soratraService;

  @PutMapping("/soratra/{id}")
  public void setSoratra(@PathVariable String id, @RequestBody String text) throws IOException {
    soratraService.setSoratra(id, text);
  }

  @GetMapping("/soratra/{id}")
  public Response getSoratra(@PathVariable String id) {
    return soratraService.getSoratra(id);
  }
}
