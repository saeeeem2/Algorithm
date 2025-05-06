import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 1. 숫자를 문자열로 변환
        String[] numberList = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            numberList[i] = String.valueOf(numbers[i]);
        }
        // 2. 커스텀 정렬: (a + b)와 (b + a)를 비교
        Arrays.sort(numberList, (a, b) -> (b + a).compareTo(a + b));

        // 3. 정렬된 배열의 첫 값이 "0"이면 전체가 0
        if (numberList[0].equals("0")) {
            return "0";
        }

        // 4. 결과 문자열 조합 (StringBuilder 사용)
        StringBuilder answer = new StringBuilder();
        for (String num : numberList) {
            answer.append(num);
        }

        return answer.toString();
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(new int[]{6, 10, 2})); // 출력: "6210"
        System.out.println(sol.solution(new int[]{3, 30, 34, 5, 9})); // 출력: "9534330"
    }
}
