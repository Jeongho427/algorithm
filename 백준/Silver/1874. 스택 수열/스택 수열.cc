#include<iostream>
#include<stack>
#include<vector>
#pragma warning (disable:4996)

using namespace std;

stack<int> stk;
vector<char> v;

int n;
int recent = 1, input;

int main()
{
	scanf("%d", &n);

	for (int i = 1; i <= n; i++) {
		scanf("%d", &input);
		while (recent <= input) {
			stk.push(recent++);
			v.push_back('+');
		}
		if (input == stk.top()) {
			stk.pop();
			v.push_back('-');
		}
		else {
			printf("NO");
			return 0;
		}
	}
	for (int i = 0; i < v.size(); i++) {
		printf("%c\n", v[i]);
	}
}
