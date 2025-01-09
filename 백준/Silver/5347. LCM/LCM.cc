#include <iostream>
#include <vector>
#include <algorithm>
#pragma warning(disable:4996)

using namespace std;

long long gcd(long long int a,long long int b) {
	if (b == 0) {
		return a;
	}
	else {
		return gcd(b, a % b);
	}
}

int main()
{
	int n;
	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		long long int a,b,answer = 0;
		scanf("%lld%lld", &a, &b);

		answer= a*b/gcd(a, b);

		printf("%lld\n", answer);
	}

	return 0;
}