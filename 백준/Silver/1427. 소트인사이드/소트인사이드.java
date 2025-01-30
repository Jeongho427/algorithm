
import java.util.*;
import java.io.*;


public class Main {

    int[] arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    void solution() throws Exception {
        String str = br.readLine();
        arr=new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i]=Integer.parseInt(str.substring(i,i+1));
        }

        for(int i=0;i<arr.length;i++){
            int max=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max]<arr[j]){
                    max=j;
                }
            }
            if(arr[i]<arr[max]){
                int tmp=arr[i];
                arr[i]=arr[max];
                arr[max]=tmp;
            }
        }

        for(int a:arr){
            System.out.print(a);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}