package hei.school.soratra.service.event;

import hei.school.soratra.endpoint.Response;
import hei.school.soratra.file.BucketComponent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class SoratraService {
  private final BucketComponent bucketComponent;

  private void saveFile(String fileName, String fileContent) throws IOException {
    File file = File.createTempFile(fileName, ".txt");
    FileWriter fileWriter = new FileWriter(file);
    fileWriter.append(fileContent);
    fileWriter.close();
    bucketComponent.upload(file, fileName + ".txt");
  }

  public void setSoratra(String id, String stringContent) throws IOException {
    String source = id + ".original";
    String destination = id + ".formatted";

    saveFile(source, stringContent);
    saveFile(destination, stringContent);
  }

  public Response getSoratra(String id) {
    String original = bucketComponent.presign(id + ".original.txt", Duration.ofHours(2)).toString();
    String formatted =
        bucketComponent.presign(id + ".formatted.txt", Duration.ofHours(2)).toString();
    return new Response(original, formatted);
  }
}
