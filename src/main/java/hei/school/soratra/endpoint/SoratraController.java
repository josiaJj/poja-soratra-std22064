package hei.school.soratra.endpoint;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
public class SoratraController {
    @PutMapping(value="/soratra/{id}")
    public ResponseEntity<String> setSoratra(
            @PathVariable(name = "id") String id, @RequestBody(required = false) String soratra) {

        String returned = null;//service.getBlackAndWhiteImage(id, file);
        if (returned == null) {
            return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body("");
        }
        return ResponseEntity.ok().contentType(MediaType.TEXT_PLAIN).body("OK");
    }
}
