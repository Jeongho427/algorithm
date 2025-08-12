
import java.io.*;
import java.util.*;



public class Main {
    int n,k,answer;
    String[] cards;
    boolean[] check;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Set<String> set = new HashSet<>();
    void simul(int L,String str){
        if(L==k){
            set.add(str);
            return;
        }
        for(int i=0;i<n;i++){
            if(!check[i]){
                check[i] = true;
                simul(L+1,str+cards[i]);
                check[i] = false;
            }
        }
    }

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        cards = new String[n];
        check = new boolean[n];

        for(int i=0;i<n;i++){
            cards[i] = br.readLine();
        }

        String str="";
        simul(0,str);

        answer = set.size();

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
