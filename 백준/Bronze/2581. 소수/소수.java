import java.io.*;

class Main{
    int n,m,min=Integer.MAX_VALUE,sum=0;
    int[] arr;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    void solution()throws Exception{
        m=Integer.parseInt(br.readLine());
        n=Integer.parseInt(br.readLine());

        arr=new int[n+1];
        
        for(int i=m;i<=n;i++){
            boolean flag=true;
            if(i==1){
                continue;
            }
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                sum+=i;
                min=Math.min(min,i);
            }
        }
        if(sum>0){
            System.out.println(sum);
            System.out.println(min);
        }
        else{
            System.out.println(-1);
        }
    }
    
    public static void main(String[] args)throws Exception{
        new Main().solution();
    }
}