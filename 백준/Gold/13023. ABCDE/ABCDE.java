import java.io.*;
import java.util.*;

public class Main {
    static int n, m;
    static List<Integer>[] graph;
    static boolean[] visited;
    static boolean found = false;

    static void DFS(int v, int depth) {
        if (depth == 4) {
            found = true;
            return;
        }

        visited[v] = true;
        for (int next : graph[v]) {
            if (!visited[next]) {
                DFS(next, depth + 1);
                if (found) return;  // depth=4 도달 시 즉시 종료
            }
        }
        visited[v] = false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(visited, false);
            DFS(i, 0);
            if (found) {
                System.out.println(1);
                return;
            }
        }

        System.out.println(0);
    }
}
