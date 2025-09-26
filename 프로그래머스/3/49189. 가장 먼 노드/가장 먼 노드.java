import java.util.*;

class Node{
    int node,dist;
    
    Node(int node,int dist){
        this.node = node;
        this.dist = dist;
    }
}

class Solution {
    
    int[] distance;
    boolean[] visit;
    ArrayList<Integer>[] map;
    
    void bfs(int v){
        Queue<Node> q = new LinkedList<>();
        
        q.offer(new Node(v,0));
        visit[v] = true;
        
        while(!q.isEmpty()){
            Node cur = q.poll();
            distance[cur.node] = cur.dist;
            
            for(int n:map[cur.node]){
                if(!visit[n]){
                    q.offer(new Node(n,cur.dist+1));
                    visit[n] = true;
                }
            }
        }
        
    }
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        distance = new int[n+1];
        visit = new boolean[n+1];
        map = new ArrayList[n+1];
        
        for(int i=1;i<=n;i++){
            map[i] = new ArrayList<>();
        }
        
        for(int[] e:edge){
            map[e[0]].add(e[1]);
            map[e[1]].add(e[0]);
        }
        
        bfs(1);
        
        int max = 0;
        for(int i=1;i<=n;i++){
            max = Math.max(max,distance[i]);
        }
        for(int d:distance){
            if(max==d){
                answer++;
            }
        }
        
        return answer;
    }
}