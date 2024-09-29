#include<iostream>
#pragma warning (disable:4996)

using namespace std;

int t, m, n, k;
int map[51][51];

int dx[] = { -1,1,0,0 };
int dy[] = { 0,0,-1,1 };

void DFS(int i, int j) {
	map[i][j] = 0;

	for (int u = 0; u < 4; u++) {
		int a = i + dy[u];
		int b = j + dx[u];
		if (a >= 0 && a<n && b>=0 && b<m) {
			if (map[a][b] == 1) {
				DFS(a, b);
			}
		}
	}
}

int main()
{
	int v1, v2;
	scanf("%d", &t);
	for (int i = 0; i < t; i++) {
		int res = 0;
		scanf("%d %d %d", &m, &n, &k);
		for (int i = 0; i < k; i++) {
			scanf("%d %d", &v2, &v1);
			map[v1][v2] = 1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 1) {
					DFS(i, j);
					res++;
				}
			}
		}
		printf("%d\n", res);
	}

	return 0;
}