function solution(n) {
    var answer = 1;
    if(n%7 == 0){
        answer=Math.floor(n/7);
    } else {
        answer=Math.floor(n/7+1);
    }
    return answer;
}