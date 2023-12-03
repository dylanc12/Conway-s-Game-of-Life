package Classes;

public class Grid {

  private int[][] grid = new int[5][5];

  public Grid(int[][] grid){
    this.grid = grid;
  }

  public String toString(){
    String result = "";
    for(int i = 0; i < grid.length; i++){
      result += "{";
      for(int j = 0; j < grid[i].length; j++){
        result += grid[i][j] + ", ";
      }
      result += "}";
    }
    return result;
  }

}
