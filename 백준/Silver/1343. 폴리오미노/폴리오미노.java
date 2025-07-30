
import java.io.*;
import java.util.*;

public class Main {
    String input;
    boolean flag = true;
    StringBuilder sb = new StringBuilder();

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void func(int cnt){
        if(cnt/4>0){
            int num = cnt/4;
            cnt %= 4;

            for(int i=0;i<num;i++){
                sb.append("AAAA");
            }
        }
        for(int i=0;i<(cnt/2);i++){
            sb.append("BB");
        }
    }

    void solution() throws Exception{
        input = br.readLine();

        int cnt = 0;
        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='X'){
                cnt++;
            }
            else{
                if(cnt%2==1){
                    flag = false;
                    break;
                }
                func(cnt);
                sb.append(".");
                cnt = 0;
            }
        }
        if(cnt%2==1){
            System.out.println(-1);
            return;
        }
        if(cnt>0){
            func(cnt);
        }

        if(flag){
            System.out.println(sb);
        }
        else{
            System.out.println(-1);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
