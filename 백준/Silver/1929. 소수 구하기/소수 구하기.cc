#include<iostream>
#pragma warning (disable:4996)

using namespace std;

int arr[1000001];

void prime(int m, int n) {
	arr[0] = 1;
	arr[1] = 1;

	for (int i = 2; i <= n; i++) {
		for (int j = 2*i; j <= n; j+=i) {
			if (arr[j] == 0) {
				arr[j] = 1;
			}
		}
	}
}

int main() {
	int m, n;

	scanf("%d %d", &m, &n);

	prime(m, n);

	for (int i = m; i <= n; i++) {
		if (arr[i] == 0) {
			printf("%d\n", i);
		}
	}

	return 0;
}