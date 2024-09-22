#include<iostream>
#include<stack>
#include<vector>
#pragma warning (disable:4996)

using namespace std;

int n, res;
int num[100000];
stack<int> stk;

int main()
{

	scanf("%d", &n);

	for (int i = 0; i < n; i++) {
		scanf("%d", &num[i]);
		if (num[i] != 0) {
			stk.push(num[i]);
		}
		else {
			stk.pop();
		}
	}
	int size = stk.size();
	for (int i = 0; i < size; i++) {
		res += stk.top();
		stk.pop();
	}
	printf("%d\n", res);


	return 0;
}
