#include<iostream>
#include<stack>
#include<vector>
#pragma warning (disable:4996)

using namespace std;

stack<int> stk;
stack<int> out;
vector<int> v;

int n;
int nge[1000001];


int main()
{
	scanf("%d", &n);
	for (int i = 1; i <= n; i++) {
		scanf("%d", &nge[i]);
	}
	for (int i = n; i > 0 ; i--) {
		while (!stk.empty() && nge[i] >= stk.top()) {
			stk.pop();
		}
		if (stk.empty()) {
			out.push(-1);
		}
		else {
			out.push(stk.top());
		}
		stk.push(nge[i]);
	}
	while (!out.empty()) {
		printf("%d ", out.top());
		out.pop();
	}

	return 0;
}
