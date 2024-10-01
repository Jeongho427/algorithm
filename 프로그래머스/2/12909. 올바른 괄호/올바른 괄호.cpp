#include<string>
#include <iostream>
#include<stack>

using namespace std;

stack<char> stk;

bool solution(string s)
{
    bool answer = true;
    
    int size=s.length();
    for(int i=0;i<size;i++){
        if(s[i]=='('){
            stk.push('(');
        }
        else{
            if(!stk.empty()){
                stk.pop();
            }
            else{
                return false;
            }
        }
    }
    if(!stk.empty())
        answer=false;
    

    return answer;
}