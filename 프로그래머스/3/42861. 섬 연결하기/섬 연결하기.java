import java.util.*;

class Node implements Comparable<Node>{
    int idx,cost;
    
    Node(int idx,int cost){
        this.idx = idx;
        this.cost = cost;
    }
    
    @Override
    public int compareTo(Node n){
        return this.cost - n.cost; 
    }
}

class Solution {
    
    ArrayList<ArrayList<Node>> list = new ArrayList<>();
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        boolean[] visit = new boolean[n];
        
        for(int i = 0;i<n;i++){
            list.add(new ArrayList<>());
        }
        
        for(int i=0;i<costs.length;i++){
            list.get(costs[i][0]).add(new Node(costs[i][1],costs[i][2]));
            list.get(costs[i][1]).add(new Node(costs[i][0],costs[i][2]));
        }
        
        PriorityQueue<Node> pq = new PriorityQueue<>();
        
        pq.offer(new Node(0,0));
        
        while(!pq.isEmpty()){
            Node cur = pq.poll();
            
            if(visit[cur.idx]){
                continue;
            }
            visit[cur.idx] = true;
            answer += cur.cost;
            
            for(int i=0;i<list.get(cur.idx).size();i++){
                if(!visit[list.get(cur.idx).get(i).idx]){
                    pq.offer(list.get(cur.idx).get(i));
                }
            }
        }
        
        return answer;
    }
}