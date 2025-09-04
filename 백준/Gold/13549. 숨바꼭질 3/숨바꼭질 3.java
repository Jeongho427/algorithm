
import java.io.*;
import java.util.*;

class Pair implements Comparable<Pair> {
    int cur, time;
    Pair(int cur, int time) { this.cur = cur; this.time = time; }
    @Override public int compareTo(Pair o) { return this.time - o.time; }
}

public class Main {
    static final int MAX = 100000;
    static final int INF = 1_000_000_000;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;

    void solution() throws Exception {
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        if (n >= k) {
            System.out.println(n - k);
            return;
        }

        int[] dist = new int[MAX + 1];
        Arrays.fill(dist, INF);

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        dist[n] = 0;
        pq.offer(new Pair(n, 0));

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            if (p.cur == k) {           
                System.out.println(p.time);
                return;
            }
            if (p.time > dist[p.cur]) continue;

            int nx = p.cur * 2;
            if (nx <= MAX && dist[nx] > p.time) {
                dist[nx] = p.time;
                pq.offer(new Pair(nx, p.time));
            }

            nx = p.cur - 1;
            if (nx >= 0 && dist[nx] > p.time + 1) {
                dist[nx] = p.time + 1;
                pq.offer(new Pair(nx, p.time + 1));
            }

            nx = p.cur + 1;
            if (nx <= MAX && dist[nx] > p.time + 1) {
                dist[nx] = p.time + 1;
                pq.offer(new Pair(nx, p.time + 1));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        new Main().solution();
    }
}
