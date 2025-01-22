
import java.io.*;
import java.util.*;

public class Main {
	int n;
	int[] arr;
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	StringTokenizer st;
	
	void solution()throws Exception{
		n=Integer.parseInt(br.readLine());
		arr=new int[n];
		
		st=new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		for(int i=1;i<=arr[0];i++) {
			boolean flag=true;
			for(int a:arr) {
				if(a%i!=0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) throws Exception{
		new Main().solution();
	}

}
