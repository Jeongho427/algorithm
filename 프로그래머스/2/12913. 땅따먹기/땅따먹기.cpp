#include <iostream>
#include <vector>
using namespace std;

int solution(vector<vector<int> > land)
{
    int answer = 0;
    int row=land.size();
    int col=land[0].size();
    vector<vector<int>> dp(row, vector<int>(col, 0));
    
    for(int i=0;i<col;i++){
        dp[0][i]=land[0][i];
    }
    
    for(int i=1;i<row;i++){
        for(int j=0;j<col;j++){
            int max=0;
            for(int k=0;k<col;k++){
                if(j==k)
                    continue;
                if(max<dp[i-1][k]){ 
                    max=dp[i-1][k];
                }
            }
            dp[i][j]=max+land[i][j];
        }
    }
    
    for(int i=0;i<col;i++){
        if(answer<dp[row-1][i]){
            answer=dp[row-1][i];
        }
    }

    return answer;
}