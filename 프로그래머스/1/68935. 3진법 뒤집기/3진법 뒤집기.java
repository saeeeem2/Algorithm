class Solution {
    public int solution(int n) {
        String n_3=Integer.toString(n,3);
        StringBuffer str=new StringBuffer(n_3);
        n_3=str.reverse().toString();
        int answer = Integer.parseInt(n_3,3);
        return answer;
    }
}