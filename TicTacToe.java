import java.io.File;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String [] args)throws Exception {
        new TicTacToe().runApp();
    }
    void runApp() throws Exception{
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the filename: ");
        String filename = in.nextLine();
        in.close();
        char [][] grid = readGrid(filename);
        printGrid(grid);
        char x = 'X';
        char o = 'O';
        boolean winnerX = isWinner(grid,x);
        if(winnerX){
            System.out.print("X wins!\n");
        }
        boolean winnerO = isWinner(grid,o);
        if(winnerO){
            System.out.print("O wins!\n");
        }
        boolean checkFullGrid = isFull(grid);
        if(checkFullGrid){
            System.out.print("Draw!\n");
        }

        if(!winnerO && !winnerX && !checkFullGrid){
            System.out.print("Unknown!\n");
        }
    }
    char [][] readGrid(String filename) throws Exception{
        File inputfile = new File(filename);
        if(!inputfile.exists()){
            System.out.print("The file "+filename+" does not exist in your folder!");
            System.exit(0);
        }
        Scanner getFile = new Scanner(inputfile);
        char [][] GridReader = new char [3][3];
        int count=0;
        while (getFile.hasNextLine()) {
            String line = getFile.nextLine();
            for (int i = count; i < GridReader.length; i++) {
                for (int j = 0; j < GridReader[i].length; j++) {
                    GridReader[i][j] = line.charAt(j);
                    //System.out.println("chk"+i+" "+j+": "+GridReader[i][j]);
                }
            }
            count++;
        }
        getFile.close();
        return GridReader;
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
