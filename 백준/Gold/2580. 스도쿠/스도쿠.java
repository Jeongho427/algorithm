
import java.io.*;
import java.util.*;

public class Main {

    int[][] board=new int[9][9];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    boolean check(int row,int col,int value){
        //가로 체크
        for(int i=0;i<9;i++){
            if(board[row][i]==value)
                return false;
        }
        //세로 체크
        for(int i=0;i<9;i++){
            if(board[i][col]==value)
                return false;
        }
        //박스 체크
        int brow=(row/3)*3;
        int bcol=(col/3)*3;
        for(int i=brow;i<brow+3;i++){
            for(int j=bcol;j<bcol+3;j++){
                if(board[i][j]==value)
                    return false;
            }
        }

        return true;
    }

    void sudoku(int row,int col){
        if(row==9){
            for(int i=0;i<9;i++){
                for(int j=0;j<9;j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if(col==9){
            sudoku(row+1,0);
            return;
        }

        if(board[row][col]==0){
            for(int i=1;i<=9;i++){
                if(check(row,col,i)){
                    board[row][col]=i;
                    sudoku(row,col+1);
                }
            }
            board[row][col]=0;
            return;
        }
        sudoku(row,col+1);
    }

    void solution() throws Exception {
        for(int i=0;i<9;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        sudoku(0,0);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}