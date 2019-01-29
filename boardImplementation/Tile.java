// A tile is a sub-unit of a board

public class Tile {
   
   private int value; 

   public Tile(int value) {
      this.value = value; 
   }

   public int getValue() {
      return value;
   }


   public void setValue(int value) {
      this.value = value; 
   }

   public String toString() {
      
      return ("" + this.value); 
   }
}