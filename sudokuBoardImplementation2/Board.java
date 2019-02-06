import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
public class Board{
   
   private List<List<Integer>> values = new ArrayList<List<Integer>>();   
   
   public Board(String filePath) throws Exception{
      BoardReader br = BoardFactory.boardReader(filePath);
      this.values = br.valueReader(filePath);
   }
   
   public List<List<Integer>> getValues(){
      return values;
   }
   
   public String toString(){
      StringBuilder tiles = new StringBuilder();
      
      for(int i = 0; i < this.values.size(); i++ ) {
      
         List<Integer> row = values.get(i);
         for(int j = 0; j < row.size(); j++ ){
            if(row.get(j) != 0 ) {
               tiles.append(row.get(j));
            }
            else {
               tiles.append(".");
            }
         }
         tiles.append("\n");
      }
      return tiles.toString();
   }
}