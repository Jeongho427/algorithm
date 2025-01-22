
import java.io.*;
import java.util.*;

public class Main {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	int GCD(int a,int b) {
		if(b==0) {
			return a;
		}
		return GCD(b,a%b);
	}
	
	void solution()throws Exception{
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			int n;
			long answer=0;
			st=new StringTokenizer(br.readLine());
			n=Integer.parseInt(st.nextToken());
			int arr[]=new int[n];
			for(int j=0;j<n;j++) {
				arr[j]=Integer.parseInt(st.nextToken());
			}
			for(int j=0;j<n-1;j++) {
				for(int k=j+1;k<n;k++) {
					answer+=GCD(arr[j],arr[k]);
				}
			}
			System.out.println(answer);
		}
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
