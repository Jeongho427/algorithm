#include<iostream>
#include<algorithm>
#include<vector>
#include<queue>

using namespace std;

vector<int> v;
priority_queue<int> pq;

int main()
{
    int n,a,d,cnt=0;
    scanf("%d",&n);
    scanf("%d",&d);
    v.push_back(d);
    for(int i=1;i<n;i++){
        scanf("%d",&a);
        pq.push(a);
    }
    while(!pq.empty()){
        if(v[0]>pq.top()){
            pq.pop();
        }
        else{
            if(v[0]<=pq.top()){
                pq.push(pq.top()-1);
                pq.pop();
                v[0]++;
                cnt++;
            }
        }
    }
    printf("%d",cnt);

    return 0;
}

