class Solution {
    public int solution(int num, int k) {
        String str_num=num+"";
        String str_k=k+"";
        int answer = str_num.indexOf(str_k) >= 0 ? str_num.indexOf(str_k)+1 : -1;
        return answer;
    }
}