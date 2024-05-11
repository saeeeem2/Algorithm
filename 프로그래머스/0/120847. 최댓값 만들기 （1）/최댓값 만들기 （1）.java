class Solution {
    public int solution(int[] numbers) {
        int num1=0;
        int num2=0;
        int idx=0;
        for(int i=0; i<numbers.length; i++){
            if(num1<numbers[i]){
                num1=numbers[i];
                idx=i;
            }
        }
        for(int i=0; i<numbers.length; i++){
            if(i!=idx && num2<numbers[i]){
                num2=numbers[i];
            } 
        }
        return num1*num2;
    }
}