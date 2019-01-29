// I tried the following but was unable to resolve the error
// import java.io.Scanner;
// import java.io.File;
// import java.util.ArrayList;
import java.util.*;
import java.io.*;

// playSudoku is a solver which solves Sudoku boards
// this is version 1 where it only prints the board

public class playSudoku {

   public static void main(String[] args) throws FileNotFoundException {
    
      Board b = new Board("sudoku.sdk");
      System.out.println(b+"\nSudoku Board printed");
   
   }        
}