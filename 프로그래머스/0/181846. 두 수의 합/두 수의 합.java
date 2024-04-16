import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger num = new BigInteger(a);
        BigInteger num2 = new BigInteger(b);
        String answer = (num.add(num2)).toString();
        return answer;
    }
}