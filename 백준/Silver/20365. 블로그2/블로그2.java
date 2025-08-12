
import java.io.*;
import java.util.*;



public class Main {
    int n,answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int bCnt = 0,rCnt = 0;
        char curColor = '\0';
        for(int i=0;i<input.length();i++){
            if(curColor != input.charAt(i)){
                if(input.charAt(i)=='B'){
                    bCnt++;
                }
                else{
                    rCnt++;
                }
                curColor = input.charAt(i);
            }
        }
        answer = Math.min(bCnt, rCnt)+1;
        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
