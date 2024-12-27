#include <string>
#include <vector>

using namespace std;

int solution(int n) {
    int answer = 0;
    
    vector<int> v(60001);
    
    v[1]=1;
    v[2]=2;
    
    for(int i=3;i<=n;i++){
        v[i]=(v[i-2]+v[i-1])%1000000007;
    }
    
    answer=v[n];
    
    return answer;
}