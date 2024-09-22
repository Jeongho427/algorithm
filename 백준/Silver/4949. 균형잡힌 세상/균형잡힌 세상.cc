#include<iostream>
#include<stack>
#include<string>
#pragma warning (disable:4996)

using namespace std;

int main() {

	while (1) {
		string input;
		stack<char> s;
		int check = 0;
		getline(cin, input);
		if (input == ".") {
			break;
		}

		for (int i = 0; i < input.size(); i++) {
			if (input[i] == '(' || input[i] == '[') {
				s.push(input[i]);
			}
			else if (input[i]==')') {
				if (!s.empty() && s.top() == '(') {
					s.pop();
				}
				else {
					check = 1;
					break;
				}
			}
			else if (input[i] == ']') {
				if (!s.empty() && s.top() == '[') {
					s.pop();
				}
				else {
					check = 1;
					break;
				}
			}
		}
		if (check == 0 && s.empty()) {
			printf("yes\n");
		}
		else {
			printf("no\n");
		}
	}
	
	return 0;
}