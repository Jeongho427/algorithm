#include<iostream>
#include<vector>
#include<stdlib.h>
#include<queue>
#pragma warning(disable:4996)
using namespace std;

int N, L, R, answer;
int flag = 1;
int map[50][100];
int visit[50][100];
int dx[] = { -1,1,0,0 };
int dy[] = { 0,0,-1,1 };


void BFS(int x,int y)
{
	int sum = 0;
	queue<pair<int, int>> q;
	vector<pair<int, int>> v;

	q.push(make_pair(x, y));
	visit[x][y] = 1;
	v.push_back(make_pair(x, y));
	sum += map[x][y];

	while (!q.empty()) {
		pair<int, int> p = q.front();
		q.pop();

		for (int j = 0; j < 4; j++) {
			int a = p.first + dx[j];
			int b = p.second + dy[j];
			if (a >= 0 && a < N && b >= 0 && b < N && !visit[a][b]) {
				if (abs(map[p.first][p.second] - map[a][b]) >= L && abs(map[p.first][p.second] - map[a][b]) <= R) {
					q.push(make_pair(a, b));
					v.push_back(make_pair(a, b));
					visit[a][b] = 1;
					sum += map[a][b];
					flag = 1;
				}
			}
		}
	}
	int d = sum / v.size();
	for (int i = 0; i < v.size(); i++) {
		int vx = v[i].first;
		int vy = v[i].second;
		map[vx][vy] = d;
	}
}

int main()
{
	scanf("%d%d%d", &N, &L, &R);

	for (int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			scanf("%d", &map[i][j]);
		}
	}

	while (flag) {
		flag = false;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				visit[i][j] = 0;
			}
		}
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (!visit[i][j]) {
					BFS(i, j);
				}
			}
		}
		if (!flag) {
			break;
		}
		answer++;
	}

	printf("%d", answer);

	return 0;
}