class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        for(int i=0; i<babbling.length; i++){
            babbling[i]=babbling[i].replaceAll("aya","1")
            .replaceAll("ye","1")
            .replaceAll("woo","1")
            .replaceAll("ma","1")
            .replaceAll("1","");
            if(babbling[i].length()==0){
                answer++;
            }
        }
        return answer;
    }
}