class Solution {
    public int solution(int n) {
        String n3=Integer.toString(n,3);
        StringBuffer str=new StringBuffer(n3);
        n3=str.reverse().toString();
        int answer = Integer.parseInt(n3,3);
        return answer;
    }
}