public class PlaySudoku{

   public static void main(String[] args) throws Exception{
      
      System.out.println("SS VERSION");
      Board boardSs = new Board("sudoku.ss");
      System.out.println(boardSs);
      
      System.out.println("\n\n\n");
      
      System.out.println("SDK VERSION");
      Board boardSdk = new Board("sudoku.sdk");
      System.out.println(boardSdk);
      
      System.out.println("\n\n\n");
      System.out.println("no extension");
      Board boardNoExtension = new Board("sudoku");
      
      System.out.println("\n\n\n");
      System.out.println("wrong extension");
      Board boardWrongExtension = new Board("sudoku.txt");
      
   }
}