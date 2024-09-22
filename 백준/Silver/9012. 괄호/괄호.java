import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stack = new Stack<>();
        int[] check = new int[n];

        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            int size = input.length();
            for (int j = 0; j < size; j++) {
                char c = input.charAt(j);
                if (c == '(') {
                    stack.push(c);
                }
                else {
                    if (stack.empty()) {
                        check[i]=1;
                        break;
                    }
                    else {
                        stack.pop();
                    }
                }
            }
            if (!stack.empty()) {
                check[i]=1;
            }
            if(check[i]==1){
                System.out.println("NO");
            }
            else {
                System.out.println("YES");
            }
            stack.clear();
        }
    }
}