
import java.io.*;
import java.util.*;



class Main {
    int n,m,answer;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    LinkedList<Integer> dq = new LinkedList<>();

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        int[] arr = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=1;i<=n;i++){
            dq.offer(i);
        }
        for(int x:arr){
            int mid;
            int idx = dq.indexOf(x);
            if(dq.size()%2==0)
                mid=dq.size()/2-1;
            else
                mid=dq.size()/2;

            if(idx<=mid){
                for(int j=0;j<idx;j++){
                    int tmp = dq.pollFirst();
                    dq.offerLast(tmp);
                    answer++;
                }
            }
            else{
                for(int j=0;j<dq.size()-idx;j++){
                    int tmp = dq.pollLast();
                    dq.offerFirst(tmp);
                    answer++;
                }
            }
            dq.pollFirst();
        }

        System.out.println(answer);
    }



    public static void main(String[] args) throws Exception{
        new Main().solution();
    }

}