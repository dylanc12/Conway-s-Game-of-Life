/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dylancicone
 */
public class Tests {
    private final Grid grid;
    
    public Tests(Grid grid){
        this.grid = grid;
    }
    
    public void runTests(){
        System.out.println("Hello, World!");
        
        grid.printGrid();
        System.out.println("Element at (0,0): " + grid.getElement(0, 0));
    }
}
