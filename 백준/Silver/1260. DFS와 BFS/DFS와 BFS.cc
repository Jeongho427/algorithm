#include<iostream>
#include<vector>
#include<queue>
#include<algorithm>
#pragma warning (disable:4996)

using namespace std;

int m, n, v;
int front, rear;
int map[1001][1001];
int visit_d[1001];
int visit_b[1001];

int q[1001];

void DFS(int v) {
	visit_d[v] = 1;
	printf("%d ", v);
	for (int i = 1; i <= n; i++) {
		if (map[v][i] == 1 && !visit_d[i]) {
			DFS(i);
		}
	}
}

void BFS(int v) {
	visit_b[v] = 1;
	printf("%d ", v);
	q[rear++] = v;
	while (front < rear) {
		v = q[front++];
		for (int i = 1; i <= n; i++) {
			if (map[v][i] == 1 && !visit_b[i]) {
				visit_b[i] = 1;
				printf("%d ", i);
				q[rear++] = i;
			}
		}
	}
}

int main() {
	int v1, v2;
	scanf("%d%d%d", &n, &m, &v);
	for (int i = 0; i < m; i++) {
		scanf("%d%d", &v1, &v2);
		map[v1][v2] = 1;
		map[v2][v1] = 1;
	}
	DFS(v);
	printf("\n");
	BFS(v);

	return 0;
}