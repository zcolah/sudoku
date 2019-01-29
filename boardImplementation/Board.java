// I tried the following but was unable to resolve the error
// import java.io.Scanner;
// import java.io.File;
// import java.util.ArrayList;

import java.io.*;
import java.util.*;


// A sudoku board consists of tiles which store values 
// between 1 to 9 and 0 if empty
 
public class Board {
   
   private String fileName;
   
   // I used an ArrayList of tiles
   // I later learnt as can be seen in Assignment 2 that 2D arrays are better
   private ArrayList<Tile> values;  

   public Board(String fileName)throws FileNotFoundException {
   
      this.values = new ArrayList<Tile>();
      this.fileName = fileName;
      this.values = valueReader(this.fileName); 
      
   }

   public ArrayList<Tile> valueReader(String fileName) throws FileNotFoundException {
   
      File f = new File(this.fileName);
      Scanner lineReader = new Scanner(f);
      
      ArrayList<Tile> values = new ArrayList<Tile>();
      
      while(lineReader.hasNextLine()) {
         String line = lineReader.next();
         for(char character: line.toCharArray()) {
            int value = 0; 
         
            if(character != '.') {
               value = Character.getNumericValue(character);
            }
            values.add(new Tile(value));
         }
      }     
       
      return values;
   }

   public String toString() {
      
      StringBuilder tiles = new StringBuilder();
      
      // for loop to print tiles
      for(int i = 0; i < this.values.size(); i++ ) {
         
         // if value is not a 0 aka not empty
         if(this.values.get(i).getValue() != 0 ) {
            tiles.append(this.values.get(i));
         }
         else {
            tiles.append(".");
         }
         
         // print a new line after 9 tiles are printed
         if((i+1)%9 == 0 ) {
            tiles.append("\n");
         }
      }    
      return tiles.toString();   
   }
   
}