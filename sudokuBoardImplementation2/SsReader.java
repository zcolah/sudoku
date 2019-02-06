import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class SsReader implements BoardReader{

   public List<List<Integer>> valueReader(String filepath) throws IOException{
      File f = new File(filepath);
      Scanner lineReader = new Scanner(f);
            
      List<List<Integer>> values = new ArrayList<List<Integer>>();
            
            
      while(lineReader.hasNextLine()) {
         String line = lineReader.next();
         if(!line.equals("-----------")){
            List<Integer> rowValues = new ArrayList<Integer>(); 
            for(char character: line.toCharArray()) {
            // if valid
               if(character != '|' && character != '-'){
                  int value = 0; 
                  if(character != '.') {
                     value = Character.getNumericValue(character);
                  }
                  rowValues.add(value);
               }
            }
            values.add(rowValues); 
         }
      }
        
      return values;
   }
}