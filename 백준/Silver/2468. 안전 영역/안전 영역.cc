#include<iostream>

using namespace std;

int n,big,cnt,res;
int area[101][101];
int visit[101][101];
int dx[]={-1,1,0,0};
int dy[]={0,0,-1,1};

void DFS(int x,int y,int k)
{
    int a,b;
    visit[x][y]=0;

    for(int i=0;i<4;i++){
        a=x+dx[i];
        b=y+dy[i];
        if(a>=0&&a<n&&b>=0&&b<n){
            if(area[a][b]>k&&visit[a][b]){
                DFS(a,b,k);
            }
        }
    }
}

int main()
{
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            scanf("%d",&area[i][j]);
            if(area[i][j]>big){
                big=area[i][j];
            }
        }
    }
    for(int k=0;k<=big;k++){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(area[i][j]>k){
                    visit[i][j]=1;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(area[i][j]>k&&visit[i][j]){
                    DFS(i,j,k);
                    cnt++;
                }
            }
        }
        if(cnt>res){
            res=cnt;
        }
        cnt=0;
    }
    printf("%d",res);

    return 0;
}

