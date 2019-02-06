import java.io.IOException;
import java.util.List;

public interface BoardReader {
   public List<List<Integer>> valueReader(String filepath) throws IOException;
}