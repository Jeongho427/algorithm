
import java.io.*;
import java.util.*;


public class Main {
    int n,white,blue;
    int[][] map;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;


    void divide(int x,int y,int n){
        int num=map[x][y];
        boolean flag=true;
        for(int i=x;i<x+n;i++){
            for(int j=y;j<y+n;j++){
                if(num!=map[i][j]) {
                    flag=false;
                }
            }
        }
        if(flag){
            if(num==0)
                white++;
            else
                blue++;
        }
        else{
            int size=n/2;
            divide(x,y,size);
            divide(x+size,y,size);
            divide(x,y+size,size);
            divide(x+size,y+size,size);
        }
    }
    void solution() throws Exception{
        n=Integer.parseInt(br.readLine());
        map=new int[n][n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<n;j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        divide(0,0,n);

        System.out.println(white+"\n"+blue);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}