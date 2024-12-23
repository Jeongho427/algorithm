#include <string>
#include <stack>
#include <vector>

using namespace std;

vector<int> solution(vector<int> numbers) {
    vector<int> answer;
    stack<int> stk;
    stack<int> ans;
    
    for(int i=numbers.size()-1;i>=0;i--){
        while(!stk.empty()&&stk.top()<=numbers[i]){
                stk.pop();
        }
        if(stk.empty()){
            ans.push(-1);
        }
        else{
            ans.push(stk.top());
        }
        stk.push(numbers[i]);
    }
    while(!ans.empty()){
        answer.push_back(ans.top());
        ans.pop();
    }
    
    return answer;
}