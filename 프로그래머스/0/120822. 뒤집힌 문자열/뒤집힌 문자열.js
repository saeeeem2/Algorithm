function solution(my_string) {
    var splitString = my_string.split("");
    var reverseArray = splitString.reverse(); 
    var answer = reverseArray.join("");
    return answer;
}