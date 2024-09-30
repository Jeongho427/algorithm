#include<iostream>
#include<queue>
#include<vector>
#pragma warning (disable:4996)

using namespace std;

queue<int> q;
vector<int> v;

int n, k;

int main()
{
	scanf("%d %d", &n, &k);
	for (int i = 1; i <= n; i++) {
		q.push(i);
	}
	while (!q.empty()) {
		for (int i = 1; i < k; i++) {
			q.push(q.front());
			q.pop();
		}
		v.push_back(q.front());
		q.pop();
	}

	printf("<");
	for (int i = 0; i < n - 1; i++) {
		printf("%d, ", v[i]);
	}
	printf("%d", v.back());
	printf(">");

	return 0;
}