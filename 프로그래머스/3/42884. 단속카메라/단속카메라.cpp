#include <string>
#include <vector>
#include <algorithm>
using namespace std;

bool cmp(vector<int> a, vector<int> b) {
   return a[1] < b[1];  // 끝점을 기준으로 정렬
}

int solution(vector<vector<int>> routes) {
   int answer = 0;
   
   sort(routes.begin(), routes.end(), cmp);
   
   int cam = -30000;
   
   for(vector<int> route : routes) {
       if(cam < route[0]) {
           cam = route[1];
           answer++;
       }
   }
   
   return answer;
}