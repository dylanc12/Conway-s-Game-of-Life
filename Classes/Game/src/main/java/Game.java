/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

/**
 *
 * @author dylancicone
 */
public class Game {

    public static void main(String[] args) {
        Grid grid = new Grid(new int[][]{
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0},
            {0,0,0,0,0}
        });
        
        Tests tests = new Tests(grid);
        tests.runTests();
    }
}
