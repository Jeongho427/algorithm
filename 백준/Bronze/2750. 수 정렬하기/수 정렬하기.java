
import java.util.*;
import java.io.*;

public class Main {

    int n;
    int[] arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int a:arr){
            System.out.println(a);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}