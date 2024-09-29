#include<iostream>
#include<algorithm>
#include<vector>
#include<queue>

using namespace std;

typedef struct St{
    int a;
    int b;
}st;

st s[10001];

priority_queue<int> pq;

bool comp(const st& l, const st& r){
    return l.a<r.a;
}

int main()
{
    int n,a,b,l,p,cnt=0;
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d%d",&a,&b);
        s[i]={a,b};
    }
    scanf("%d%d",&l,&p);
    sort(s, s+n,comp);
    for(int i=0;i<n;i++){
        while(s[i].a>p){
            if(pq.empty()){
                printf("-1");
                exit(0);
            }
            p+=pq.top();
            pq.pop();
            cnt++;
        }
        pq.push(s[i].b);
    }
    while(l>p){
        p+=pq.top();
        pq.pop();
        cnt++;
    }
    if(l<=p){
        printf("%d",cnt);
    }
    else{
        printf("-1");
    }

    return 0;
}

