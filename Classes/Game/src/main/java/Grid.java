/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dylancicone
 */
public class Grid {
    private int[][] grid = new int[5][5];
    
    public Grid(int[][] grid){
        this.grid = grid;
    }
    
    public void setGrid(int[][] grid){
        this.grid = grid;
    }
    
    public void setElement(int row, int col, int val){
        grid[row][col] = val;
    }
    
    public int getElement(int row, int col){
        return grid[row][col];
    }
    
    public void printGrid(){
        for(int i = 0; i < grid.length; i++){
            System.out.print("{");
            for(int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j]);
                if(j < grid[i].length - 1){
                    System.out.print(", ");
                }
            }
            System.out.println("}");
        }
    }
}
