import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String [] args) {
        new TicTacToeGame().runApp();
    }
    void runApp()  {
        char [][] grid = new char [3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                grid[i][j]='-';
            }
        }
        printGrid(grid);
        char x = 'X';
        char o = 'O';
        readGrid(grid,x,o);
    }
    void readGrid(char [][] grid, char x, char o){
        char [][] Grid = grid;
        Scanner in = new Scanner(System.in);
        int i=0;
        while (!isWinner(grid,x) || !isFull(grid)|| !isWinner(grid,o)){
            int r,c;
            if(i%2!=0){
                System.out.print("Player " +o+", enter your move (row[1-3] column[1-3]): ");
                r=in.nextInt();
                c=in.nextInt();
                Grid[r-1][c-1]= o;
                printGrid(Grid);
                boolean winnerO = isWinner(grid,o);
                if(winnerO){
                    System.out.print("O wins!\n");
                    System.exit(0);
                }
                boolean checkFullGrid = isFull(grid);
                if(checkFullGrid){
                    System.out.print("Draw!\n");
                    System.exit(0);
                }
            }
            else{
                System.out.print("Player " +x+", enter your move (row[1-3] column[1-3]): ");
                r=in.nextInt();
                c=in.nextInt();
                Grid[r-1][c-1]= x;
                printGrid(Grid);
                boolean winnerX = isWinner(grid,x);
                if(winnerX){
                    System.out.print("X wins!\n");
                    System.exit(0);
                }
                boolean checkFullGrid = isFull(grid);
                if(checkFullGrid){
                    System.out.print("Draw!\n");
                    System.exit(0);
                }
            }
            i++;
        }
    }
    void printGrid(char[][] grid){
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
    boolean checkRows(char [][] grid,char player){
        for(int i=0;i< grid.length;i++){
            if(player == grid[i][0] && player == grid[i][1] && player == grid[i][2]){
                return true;
            }
        }
        return false;

    }
    boolean checkCols(char [][] grid,char player){
        for(int j=0;j< 3;j++){
            if(player == grid[0][j] && player == grid[1][j] && player == grid[2][j]){
                return true;
            }
        }
        return false;
    }
    boolean checkDiagonals(char [][] grid,char player){
        if(player == grid[0][0] && player == grid[1][1] && player == grid[2][2]){
            return true;
        }
        else if(player == grid[0][2] && player== grid[1][1] && player == grid[2][0]){
            return true;
        }
        return false;
    }
    boolean isWinner(char [][] grid,char player){
        if(checkRows(grid,player) || checkCols(grid,player) || checkDiagonals(grid,player)){
            return true;
        }
        return false;
    }
    boolean isFull(char [][] grid){
        for(int i=0;i< grid.length;i++){
            for(int j=0; j< grid.length; j++){
                if(grid[i][j]=='-'){
                    return false;
                }
            }
        }
        return true;
    }
}
