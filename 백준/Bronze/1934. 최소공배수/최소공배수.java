
import java.io.*;
import java.util.*;

public class Main {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	int GCD(int a,int b) {
		if(a%b==0) {
			return b;
		}
		return GCD(b,a%b);
	}
	
	void solution()throws Exception{
		int n=Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			int a=Integer.parseInt(st.nextToken());
			int b=Integer.parseInt(st.nextToken());
			int gcd=GCD(a,b);
			System.out.println(a*b/gcd);
		}
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
