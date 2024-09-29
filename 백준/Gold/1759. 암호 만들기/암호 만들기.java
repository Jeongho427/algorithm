
import java.util.*;
import java.io.*;

public class Main {

    int L,C,answer;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    char[] arr;
    char[] combi;
    boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') return true;
        else return false;
    }
    void findCombi(int v,int next,int vowel, int cons){
        if(v==L){
            if(vowel>=1&&cons>=2){
                System.out.println(new String(combi));
            }
            return;
        }
        else{
            for(int i=next;i<C;i++){
                combi[v]=arr[i];
                if(isVowel(arr[i])) {
                    findCombi(v+1,i+1,vowel+1,cons);
                }
                else{
                    findCombi(v+1,i+1,vowel,cons+1);
                }
            }
        }
    }

    void solution()throws Exception{
        st = new StringTokenizer(br.readLine());
        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        arr = new char[C];
        combi = new char[L];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<C;i++){
            arr[i] = st.nextToken().charAt(0);
        }
        Arrays.sort(arr);
        findCombi(0,0,0,0);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
