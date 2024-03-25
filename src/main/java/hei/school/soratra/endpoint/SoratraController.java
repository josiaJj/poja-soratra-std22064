package hei.school.soratra.endpoint;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SoratraController {
  @PutMapping(value = "/soratra/{id}")
  public ResponseEntity<String> setSoratra(
      @PathVariable(name = "id") String id, @RequestBody(required = false) String soratra) {

    String returned = null;
    if (returned == null) {
      return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body("");
    }
    return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body("OK");
  }
    /*
  @GetMapping(value = "/soratra/{id}")
    public ResponseEntity<String> getSoratraById(@PathVariable(name = "id") String id) {
      String returned = soratraService.getSoratraById(id);
      if (returned == null) {
          RestSoratra restSoratra = new RestSOratra();
          restSoratra.setOriginal_url("https://original.url");
          restSoratra.setTransformed_url("https://transformed.url");
          return restSoratra;
      }
  }
  */


}
