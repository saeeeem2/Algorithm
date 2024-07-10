class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int count = 0;
        for(int i=0; i<=30; i++){
            count=0;
            for(int j=0; j<strArr.length; j++){
                if(i==strArr[j].length()){
                    count ++;
                }
                if(answer<count){
                    answer=count;
                }
            }
        }
        return answer;
    }
}