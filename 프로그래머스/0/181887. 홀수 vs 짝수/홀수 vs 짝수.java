class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum=0;
        int sub=0;
        for(int i=0; i<num_list.length; i++){
            if(i%2==0){
                sum+=num_list[i];
            } else {
                sub+=num_list[i];
            }
        }
        return sum>sub ? sum : sub;
    }
}