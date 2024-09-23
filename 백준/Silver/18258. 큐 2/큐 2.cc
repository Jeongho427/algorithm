#include<iostream>
#include<queue>
#include<cstring>
#pragma warning(disable:4996)

using namespace std;

queue<int> q;

int main()
{
	int n;
	scanf("%d", &n);
	for (int i = 0; i < n; i++) {
		char cmd[10];
		scanf("%s",cmd);
		if (strcmp(cmd, "push") == 0) {
			int num;
			scanf("%d", &num);
			q.push(num);
		}
		else if (strcmp(cmd,"pop")==0) {
			if (q.empty()) {
				printf("-1\n");
			}
			else {
				printf("%d\n",q.front());
				q.pop();
			}
		}
		else if (strcmp(cmd, "size") == 0) {
			printf("%d\n", q.size());
		}
		else if (strcmp(cmd, "empty") == 0) {
			if (q.empty()) {
				printf("1\n");
			}
			else {
				printf("0\n");
			}
		}
		else if (strcmp(cmd, "front") == 0) {
			if (q.empty()) {
				printf("-1\n");
			}
			else {
				printf("%d\n", q.front());
			}
		}
		else {
			if (q.empty()) {
				printf("-1\n");
			}
			else {
				printf("%d\n", q.back());
			}
		}
	}

	return 0;
}