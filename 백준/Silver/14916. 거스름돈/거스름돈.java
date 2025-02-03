
import java.io.*;
import java.util.*;

public class Main {
	int n,answer=0;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	
	void solution()throws Exception{
		n=Integer.parseInt(br.readLine());
		
		while(n%5!=0) {
			if(n-2<0) {
				break;
			}
			if(n==3) {
				break;
			}
			n-=2;
			answer++;
		}
		answer+=n/5;
		
		if(answer==0) {
			answer=-1;
		}
		
		System.out.println(answer);
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
