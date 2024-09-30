#include<iostream>
#include<queue>

using namespace std;

priority_queue<int> pq;

int main()
{
    int n,ch,t,h, res=0;
    scanf("%d %d %d",&n,&ch,&t);
    for(int i=0;i<n;i++){
        scanf("%d",&h);
        pq.push(h);
    }
    while(!pq.empty()&&t>0){
        if(pq.top()==1&&ch==1){
            printf("NO\n%d",pq.top());
            return 0;
        }
        else{
            if(pq.top()>=ch){
                pq.push(pq.top()/2);
                pq.pop();
                t--;
                res++;
            }
            else{
                pq.pop();
            }
        }

    }
    if(pq.empty()||pq.top()<ch){
        printf("YES\n%d",res);
    }
    else{
        printf("NO\n%d",pq.top());
    }


    return 0;
}

