class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        for(int i=0; i<k; i++){
            int num = i*2;
            if(num>=numbers.length){
                num%=numbers.length;
            }
            answer=numbers[num];
        }
        return answer;
    }
}