#include<iostream>
#include<vector>
#include<climits>
#pragma warning(disable:4996)

using namespace std;

int main()
{
	int n, s, answer = 0;
	int flag = 0;

	vector<int> v;

	scanf("%d%d", &n, &s);

	for (int i = 0; i < n; i++) {
		int num;
		scanf("%d", &num);
		v.push_back(num);
	}

	int lt = 0;
	int sum = 0;
	int len=INT_MAX;

	for (int rt = 0; rt < n; rt++) {
		while (sum + v[rt] >= s&&lt<=rt) {
			if (len > rt - lt + 1) {
				len = rt - lt + 1;
				flag = 1;
			}
			sum -= v[lt];
			lt++;
		}
		sum += v[rt];
	}

	if (!flag) {
		answer = 0;
	}
	else {
		answer = len;
	}

	printf("%d", answer);

	return 0;
}