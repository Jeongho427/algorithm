#include <iostream>
#include <vector>

using namespace std;

int solution(int m, int n, vector<vector<int>> puddles) {
    
    vector<vector<int>> dp(n + 1, vector<int>(m + 1, 0));
    
    vector<vector<bool>> isPuddle(n + 1, vector<bool>(m + 1, false));
    
    for (auto puddle : puddles) {
        int x = puddle[0];
        int y = puddle[1];
        isPuddle[y][x] = true;
    }
    
    dp[1][1] = 1;
    
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (isPuddle[i][j]) {
                dp[i][j] = 0;
            } 
            else {
                if (i > 1) {
                    dp[i][j] += dp[i - 1][j]; 
                }
                if (j > 1){ 
                    dp[i][j] += dp[i][j - 1]; 
                }
                
                dp[i][j] %= 1000000007;
            }
        }
    }
    
    return dp[n][m];
}