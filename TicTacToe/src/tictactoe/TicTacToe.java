/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.util.Scanner;
/**
 *
 * @author chris
 */
public class TicTacToe {
    static char[][] board;
    private char player;
    
    public TicTacToe(){
        board = new char[3][3];
        player = 'X';
        initBoard();
    }
    
    public static void initBoard(){
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                board[i][j] = ' ';
            }
        }
    }
    
    public static void printBoard(){
        System.out.println();
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("-----------");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("-----------");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
    }
    
    public boolean putAnswer(int a, int b){
        if((a >= 0) && (a < 3)){
            if((b < 3) && (b >= 0)){
                if(board[a][b] == ' '){
                    board[a][b] = player;
                    return true;
                }
            }
        }
        return false;
    }
    
    public void changePlayer(){
        if(player == 'X'){
            player = 'O';
        }
        else {
            player = 'X';
        }
    }
    
    public static boolean checkIfWin(){
        for(int i = 0; i < 3; i++){
            if(board[i][0] == board[i][1] && board[i][0] == board[i][2] && board[i][1] == board[i][2] && board[i][0] != ' ' && board[i][1] != ' ' && board[i][2] != ' '){
                return true;
            }   
        }
        for(int j = 0; j < 3; j++){
            if(board[0][j] == board[1][j] && board[0][j] == board[2][j] && board[1][j] == board[2][j] && board[0][j] != ' ' && board[1][j] != ' ' && board[2][j] != ' '){
                return true;
            }
                
        }
        if(board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[1][1] == board[2][2] && board[0][0] != ' ' && board[1][1] != ' ' && board[2][2] != ' '){
            return true;
        }
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[1][1] == board[2][0] && board[0][2] != ' ' && board[1][1] != ' ' && board[2][0] != ' '){
            return true;
        }
        return false;
    }
    
    public static boolean checkIfDraw(int pl){
        if(pl == 9){
            return true;
        }
        return false;
    }
    
    public void printWin(){
        System.out.println("Player " + player + " wins!");
    }
    
    public static void main(String[] args) {
       TicTacToe paixnidi = new TicTacToe();
       Scanner in = new Scanner(System.in);
       int pl = 0;
       for(int i = 0; i < 10; i++){
           paixnidi.printBoard();
           if(paixnidi.checkIfWin() == true){
               paixnidi.changePlayer();
               paixnidi.printWin();
               break;
           }
           if(paixnidi.checkIfWin() == false){
               if(checkIfDraw(pl) == true){
                   System.out.println("Draw.");
                   break;
               }
           }
           System.out.println("Give coordinates(row, column) to place your mark:");
           int a = in.nextInt();
           int b = in.nextInt();
           if(paixnidi.putAnswer(a, b) == false){
               System.out.println("Invalid move. Please give new coordinates:");
               a = in.nextInt();
               b = in.nextInt();
           }
           paixnidi.putAnswer(a, b);
           pl = pl + 1;
           paixnidi.changePlayer();
       }
    }
    
}
