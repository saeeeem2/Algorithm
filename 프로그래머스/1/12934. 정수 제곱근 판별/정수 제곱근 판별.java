class Solution {
    public long solution(long n) {
        long answer = Math.sqrt(n)%1==0 ? (long)Math.pow(Math.sqrt(n)+1,2) : -1;
        return answer;
    }
}