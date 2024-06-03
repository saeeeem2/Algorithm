class Solution {
    public int solution(int order) {
        String str=order+"";
        String str2=str.replaceAll("[0124578]","");
        int answer = str2.length();
        return answer;
    }
}