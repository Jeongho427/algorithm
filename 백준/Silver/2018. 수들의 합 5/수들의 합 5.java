import java.io.*;

class Main{
    int n,answer;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    void solution()throws Exception{
        n=Integer.parseInt(br.readLine());
        int lt=1,rt=1;
        int sum=0;
        while(lt<=rt&&lt<=n){
            if(sum>n){
                sum-=lt;
                lt++;
            }
            else{
                if(sum==n){
                    answer++;
                }
                sum+=rt;
                rt++;
            }
        }
        System.out.println(answer);
    }
    
    public static void main(String[] args)throws Exception{
        new Main().solution();
    }
}