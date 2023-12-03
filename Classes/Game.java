package Classes;

public class Game {
  
  public static void main(String[] args){
  
    Grid grid = new Grid(new int[][] {
      {0,0,0,0,0},
      {0,0,0,0,0},
      {0,0,0,0,0},
      {0,0,0,0,0},
      {0,0,0,0,0}
    });

    System.out.println(grid.toString());
  }

}