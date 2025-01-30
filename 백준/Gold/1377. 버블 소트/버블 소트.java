
import java.util.*;
import java.io.*;

class Pair implements Comparable<Pair>{
    int value,index;
    Pair(int value,int index){
        this.value=value;
        this.index=index;
    }

    @Override
    public int compareTo(Pair p){
        return this.value-p.value;
    }
}

public class Main {

    int n,max;
    Pair[] A;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


    void solution() throws Exception {
        n=Integer.parseInt(br.readLine());
        A=new Pair[n];
        for(int i=0;i<n;i++){
            A[i]=new Pair(Integer.parseInt(br.readLine()),i);
        }
        Arrays.sort(A);
        for(int i=0;i<n;i++){
            max=Math.max(max,A[i].index-i);
        }
        System.out.println(max+1);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}