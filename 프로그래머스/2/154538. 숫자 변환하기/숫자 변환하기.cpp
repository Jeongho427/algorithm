#include <string>
#include <vector>
#include <algorithm>
#include <climits>
#include <queue>
using namespace std;

int solution(int x, int y, int n) {
    vector<int> dist(y+1, INT_MAX);
    queue<int> q;
    
    q.push(x);
    dist[x] = 0;
    
    while(!q.empty()) {
        int curr = q.front();
        q.pop();
        
        if(curr == y) return dist[curr];
        
        // 모든 가능한 연산을 시도
        vector<int> next = {curr + n, curr * 2, curr * 3};
        
        for(int nxt : next) {
            if(nxt <= y && dist[nxt] == INT_MAX) {
                dist[nxt] = dist[curr] + 1;
                q.push(nxt);
            }
        }
    }
    
    return -1;
}