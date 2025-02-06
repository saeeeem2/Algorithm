class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        String[] code_idx=code.split("");
        for(int i=0; i<code_idx.length; i++){
            if(i%q==r){
                answer+=code_idx[i];
            }
        }
        return answer;
    }
}
