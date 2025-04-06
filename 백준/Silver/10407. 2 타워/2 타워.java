
import java.util.*;
import java.io.*;


public class Main {

    String n;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution() throws Exception {
        n = br.readLine();

        if(n.equals("1")){
            System.out.println(2);
        }
        else{
            System.out.println(1);
        }
    }



    public static void main(String[] args) throws Exception {
       new Main().solution();
    }
}