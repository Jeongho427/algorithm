class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpet=brown+yellow;
        int width=0;
        int height=3;
        
        for(;height<carpet;height++){
            if(carpet%height==0){
                width=carpet/height;
                if((height-2)*(width-2)==yellow){
                    break;
                }
            }
        }
        answer[0]=width;
        answer[1]=height;
        
        return answer;
    }
}