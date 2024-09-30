
import java.io.*;
import java.util.*;

class Pair{
    int num;
    String str;
    Pair(int num,String str){
        this.num=num;
        this.str=str;
    }

}

public class Main {

    int n;
    String answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    int D(int num){
        num*=2;
        num%=10000;

        return num;
    }

    int S(int num){
        if(num<=0)
            num=9999;
        else
            num-=1;

        return num;
    }

    int L(int num){
        int res=0;
        res=num/1000;
        num%=1000;
        num*=10;
        res+=num;

        return res;
    }

    int R(int num){
        int res=0;
        res=num%10*1000;
        num/=10;
        res+=num;

        return res;
    }

    void DSLR(int input,int output){
        Queue<Pair> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        q.offer(new Pair(input,""));
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                Pair p =q.poll();
                if(p.num==output){
                    answer=p.str;
                    return;
                }
                int d = D(p.num);
                if(!set.contains(d)){
                    q.offer(new Pair(d, p.str + "D"));
                    set.add(d);
                }
                int s = S(p.num);
                if(!set.contains(s)){
                    q.offer(new Pair(s, p.str + "S"));
                    set.add(s);
                }
                int l = L(p.num);
                if(!set.contains(l)){
                    q.offer(new Pair(l, p.str + "L"));
                    set.add(l);
                }
                int r = R(p.num);
                if(!set.contains(r)){
                    q.offer(new Pair(r, p.str + "R"));
                    set.add(r);
                }
            }
        }

    }

    void solution() throws Exception {
        n=Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            DSLR(a,b);
            System.out.println(answer);
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}