
import java.util.*;
import java.io.*;

class Node{
    char left,right;
    Node(char left,char right){
        this.left=left;
        this.right=right;
    }
}

public class Main {

    int n;
    Node[] tree = new Node[100];

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void preorder(char node){
        if(node=='.')
            return;
        System.out.print(node);
        preorder(tree[node].left);
        preorder(tree[node].right);
    }

    void inorder(char node){
        if(node=='.')
            return;
        inorder(tree[node].left);
        System.out.print(node);
        inorder(tree[node].right);
    }

    void postorder(char node){
        if(node=='.')
            return;
        postorder(tree[node].left);
        postorder(tree[node].right);
        System.out.print(node);
    }

    void solution() throws Exception {
        n = Integer.parseInt(br.readLine());
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            char cur = st.nextToken().charAt(0);
            char l = st.nextToken().charAt(0);
            char r = st.nextToken().charAt(0);
            tree[cur] = new Node(l,r);
        }
        preorder('A');
        System.out.println();
        inorder('A');
        System.out.println();
        postorder('A');
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
