class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String st:skill_trees){
            StringBuilder sb = new StringBuilder();
            
            for(int i=0;i<st.length();i++){
                for(int j=0;j<skill.length();j++){
                    if(st.charAt(i)==skill.charAt(j)){
                        sb.append(st.charAt(i));
                    }
                }
            }
            
            if(skill.startsWith(sb.toString())){
                answer++;
            }
        }
        
        return answer;
    }
}