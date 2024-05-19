class Solution {
    public String solution(String rny_string) {
        String answer = rny_string.contains("m") ? rny_string.replace("m","rn") : rny_string;
        return answer;
    }
}