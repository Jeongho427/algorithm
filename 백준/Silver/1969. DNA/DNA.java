
import java.io.*;
import java.util.*;



public class Main {
    int n,m,cnt,answer;
    StringBuilder sb = new StringBuilder();
    String[] DNA;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        DNA = new String[n];

        for(int i=0;i<n;i++){
            DNA[i] = br.readLine();
        }

        for(int i=0;i<m;i++){
            char maxKey='\0';
            int maxValue = 0;
            Map<Character, Integer> hm = new HashMap<>();

            for(int j=0;j<n;j++){
                char c = DNA[j].charAt(i);
                hm.put(c,hm.getOrDefault(c,0)+1);
            }
            for(Character k:hm.keySet()){
                if(hm.get(k)>maxValue){
                    maxKey = k;
                    maxValue = hm.get(k);
                }
                else if(maxValue == hm.get(k)){
                    if(k<maxKey){
                        maxKey = k;
                    }
                }
            }
            cnt += n - maxValue;
            sb.append(maxKey);
        }


        System.out.println(sb);
        System.out.println(cnt);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
