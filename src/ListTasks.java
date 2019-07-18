import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ListTasks {
  public void readFile(){
    try {
      Path filePath = Paths.get("index.txt");
      List<String> lines = Files.readAllLines(filePath);
      if(lines.size() > 0){
        for (int i = 0; i <= lines.size() - 1; i++){
          System.out.println((i + 1 ) + " -  " + lines.get(i));
        }
      } else {
        System.out.println("No todos for today! :)");
      }
    } catch (Exception e) {
      System.out.println("Could not read the file!");
    }
  }
}

