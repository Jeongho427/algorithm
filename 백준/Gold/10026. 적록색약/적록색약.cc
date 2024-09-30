#include<iostream>
#pragma warning (disable:4996)

using namespace std;

int n, yres, nres;
char map[101][101];
char ncolor[101][101];
char ycolor[101][101];

int dx[] = { -1,1,0,0 };
int dy[] = { 0,0,-1,1 };

void no(int i, int j, char c) {
	ncolor[i][j] = '\0';

	for (int u = 0; u < 4; u++) {
		int a = i + dy[u];
		int b = j + dx[u];
		if (a >= 0 && a < n && b >= 0 && b < n) {
			if (ncolor[a][b] == c) {
				no(a, b, c);
			}
		}
	}
}

void yes(int i, int j, char c) {
	ycolor[i][j] = '\0';

	for (int u = 0; u < 4; u++) {
		int a = i + dy[u];
		int b = j + dx[u];
		if (a >= 0 && a < n && b >= 0 && b < n) {
			if (ycolor[a][b] == c || (ycolor[a][b] == 'R' && c == 'G') || (ycolor[a][b] == 'G' && c == 'R')) {
				yes(a, b, c);
			}
		}
	}
}

int main()
{
	char c;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			scanf(" %c", &c);
			ncolor[i][j] = c;
			ycolor[i][j] = c;
		}
	}
	/*for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			printf("%c", color[i][j]);
		}
		printf("\n");
	}*/
	for (int i = 0; i < n; i++) {
		for(int j=0;j<n;j++){
			if (ncolor[i][j] != '\0') {
				no(i, j, ncolor[i][j]);
				nres++;
			}
		}
	}
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			if (ycolor[i][j] != '\0') {
				yes(i, j, ycolor[i][j]);
				yres++;
			}
		}
	}
	printf("%d %d", nres, yres);

	return 0;
}