#include <iostream>
#include <vector>
#include <algorithm>
#pragma warning(disable:4996)

using namespace std;

bool cmp(int a,int b) {
	return a > b;
}

int main()
{
	int n;
	double answer = 0;

	scanf("%d", &n);

	vector<int> v(n,0);

	for (int i = 0; i < n; i++) {
		scanf("%d", &v[i]);
	}
	
	sort(v.begin(), v.end(), cmp);

	for (auto a : v) {
		if (answer < a) {
			int tmp;
			tmp = answer;
			answer = a;
			a = tmp;
		}
		answer += (double)a / 2;
	}

	printf("%.1lf", answer);

	return 0;
}