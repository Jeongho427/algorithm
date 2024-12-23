#include <string>
#include <queue>
#include <vector>

using namespace std;

long long solution(int n, vector<int> works) {
    long long answer = 0;
    int flag=1;
    
    priority_queue<int> pq;
    
    for(int i=0;i<works.size();i++){
        pq.push(works[i]);
    }
    
    while(n>0&&!pq.empty()){
        int tmp=pq.top();
        pq.pop();
        if(tmp-1>0){
             pq.push(tmp-1);
        }
        n--;
    }
    
    while(!pq.empty()){
        answer+=pq.top()*pq.top();
        pq.pop();
    }
    
    return answer;
}