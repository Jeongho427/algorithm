#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int h, w, answer = 0;

	scanf("%d %d", &h, &w);

	vector<int> v(w);

	for (int i = 0; i < w; i++) {
		scanf("%d", &v[i]);
	}

	for (int i = 1; i < w - 1; i++) {
		int lt = 0, rt = 0;
		for (int j = 0; j < i; j++) {
			lt = max(lt, v[j]);
		}
		for (int j = w - 1; j > i; j--) {
			rt = max(rt, v[j]);
		}
		answer += max(0, min(lt, rt) - v[i]);
	}

	printf("%d", answer);

	return 0;
}