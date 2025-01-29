
import java.util.*;
import java.io.*;

public class Main {

    int n,answer;
    int[] arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        n=Integer.parseInt(br.readLine());
        arr=new int[n];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        for(int k=0;k<n;k++){
            int find=arr[k];
            int lt=0;
            int rt=n-1;
            while(lt<rt){
                if(arr[lt]+arr[rt]==find){
                    if(lt!=k&&rt!=k){
                        answer++;
                        break;
                    }
                    else if(lt==k){
                        lt++;
                    }
                    else if(rt==k){
                        rt--;
                    }
                }
                else{
                    if(arr[lt]+arr[rt]>find){
                        rt--;
                    }
                    else{
                        lt++;
                    }
                }
            }
        }

        System.out.println(answer);
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}