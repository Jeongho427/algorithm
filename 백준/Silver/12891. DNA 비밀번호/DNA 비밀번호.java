
import java.util.*;
import java.io.*;

public class Main {

    int s,p,answer;
    char[] str; //주어진 문자열
    int[] dna=new int[4]; //A,C,G,T
    int[] checkDna=new int[4]; //부분 문자열

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void add(char ch){
        switch(ch){
            case 'A':
                checkDna[0]++;
                break;
            case 'C':
                checkDna[1]++;
                break;
            case 'G':
                checkDna[2]++;
                break;
            case 'T':
                checkDna[3]++;
                break;
        }
    }

    void remove(char ch) {
        switch (ch) {
            case 'A':
                if (checkDna[0] > 0) checkDna[0]--; break;
            case 'C':
                if (checkDna[1] > 0) checkDna[1]--; break;
            case 'G':
                if (checkDna[2] > 0) checkDna[2]--; break;
            case 'T':
                if (checkDna[3] > 0) checkDna[3]--; break;
        }
    }

    boolean check(){
        return checkDna[0] >= dna[0] && checkDna[1] >= dna[1] && checkDna[2] >= dna[2] && checkDna[3] >= dna[3];
    }

    void solution() throws Exception {
        st=new StringTokenizer(br.readLine());
        s=Integer.parseInt(st.nextToken());
        p=Integer.parseInt(st.nextToken());
        str=br.readLine().toCharArray();
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            dna[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<p;i++){
            add(str[i]);
        }

        if(check()){
            answer++;
        }

        for(int i=p;i<s;i++){
            add(str[i]);
            remove(str[i-p]);
            if(check()){
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}