#include <iostream>
#include <vector>
#include <algorithm>
#pragma warning(disable:4996)

using namespace std;

int gcd(int a, int b) {
	if (b == 0) {
		return a;
	}
	else {
		return gcd(b, a % b);
	}
}

int main()
{
	int a,b,ans1,ans2;
	scanf("%d%d", &a, &b);
	ans1 = gcd(a, b);
	ans2 = a * b / ans1;
	printf("%d\n%d", ans1, ans2);
	

	return 0;
}