class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int max=numbers[0] * numbers[1];
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<numbers.length; j++){
                if(max <= numbers[i] * numbers[j] && i != j) {
                    max = numbers[i] * numbers[j];
                    answer = max;
                }               
            }
        }
        return answer;
    }
}