#include <string>
#include <vector>
#include <algorithm>

using namespace std;

struct Pair{
    int start;
    int end;
};

bool cmp(Pair a,Pair b){
    return a.start<b.start;
}

int solution(vector<vector<int>> routes) {
    int answer = 1;
    int min=-30000;
    int max=30000;
    vector<Pair> v;
    
    for(int i = 0; i < routes.size(); i++) {
        v.push_back({routes[i][0], routes[i][1]});
    }
    
    sort(v.begin(),v.end(),cmp);
    
    int camera = v[0].end;
    
    for(Pair p:v){
        if(camera < p.start){
            answer++;    
            camera = p.end;
        }
        if(camera > p.end){
            camera = p.end;
        }
    }
    
    return answer;
}