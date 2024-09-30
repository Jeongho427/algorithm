#include<iostream>
#include<stack>
#include<vector>
#pragma warning (disable:4996)

using namespace std;

stack<char> stk;
vector<int> v;

int main()
{
	string str;
	cin >> str;

	int temp = 1, answer = 0;

	for (int i = 0; i < str.size(); i++) {
		if (str[i] == '(') {
			temp *= 2;
			stk.push('(');
		}
		else if (str[i] == '[') {
			temp *= 3;
			stk.push('[');
		}
		else if (str[i] == ')') {
			if (!stk.empty() && stk.top() == '(') {
				if (str[i - 1] == '(') {
					answer += temp;
					temp /= 2;
				}
				else {
					temp /= 2;
				}
				stk.pop();
			}
			else {
				printf("0");
				return 0;
			}
		}
		else {
			if (!stk.empty() && stk.top() == '[') {
				if (str[i - 1] == '[') {
					answer += temp;
					temp /= 3;
				}
				else{
					temp /= 3;
				}
				stk.pop();
			}
			else {
				printf("0");
				return 0;
			}
		}
		if (stk.empty()) {
			temp = 1;
		}
	}
	if (!stk.empty()) {
		answer = 0;
	}
	printf("%d", answer);

	return 0;
}
