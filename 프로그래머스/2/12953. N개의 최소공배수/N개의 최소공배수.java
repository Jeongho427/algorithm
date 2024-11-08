class Solution {
    
    int gcd(int a,int b){
        int r;
        while(b!=0){
            r=a%b;
            a=b;
            b=r;
        }
        
        return a; 
    }
    
    int lcm(int a,int b){
        return a*b/gcd(a,b);
    }
    
    public int solution(int[] arr) {
        int answer = 0;
        int num=arr[0];
        
        for(int i=1;i<arr.length;i++){
            num=lcm(arr[i],num);
        }
        answer=num;
        
        return answer;
    }
}