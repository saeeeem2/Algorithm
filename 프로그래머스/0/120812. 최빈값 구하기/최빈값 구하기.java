class Solution {
    public int solution(int[] array) {
        int answer = -1;
        int maxCount=0;
        boolean duplicate = false;
        for(int i=0; i<array.length; i++){
            int cnt=1;
            for(int j=0; j<array.length; j++){
                if(i!=j && array[i]==array[j]){
                    cnt++;
                }
            }
        if (cnt > maxCount) {
                maxCount = cnt;
                answer = array[i];
                duplicate = false;
            } else if (cnt == maxCount && array[i] != answer) {
                duplicate = true;
            }
        }
        return duplicate ? -1 : answer;
    }
}