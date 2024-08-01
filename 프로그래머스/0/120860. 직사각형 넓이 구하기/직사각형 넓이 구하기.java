class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width=0;
        int height=0;
        int max_x=dots[0][0];
        int min_x=dots[0][0];
        int max_y=dots[0][1];
        int min_y=dots[0][1];
        for(int i=0; i<dots.length; i++){
            if(dots[i][0]>max_x){
                max_x=dots[i][0];
            } else if(dots[i][0]<min_x){
                min_x=dots[i][0];
            }
            width=max_x-min_x;
        }
        for(int i=0; i<dots.length; i++){
            if(dots[i][1]>max_y){
                max_y=dots[i][1];
            } else if(dots[i][1]<min_y){
                min_y=dots[i][1];
            }
            height=max_y-min_y;
        }
        answer=width*height;
        return answer;
    }
}