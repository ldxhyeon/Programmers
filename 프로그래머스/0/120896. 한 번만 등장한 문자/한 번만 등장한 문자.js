function solution(s) {
    
    let arr = s.split("").sort();
    
    let answer = '';
    
    // indexOf 값의 시작점 index 반환
    // lastIndexOf 값의 끝점부터 반환
    
    for(let i = 0; i < arr.length; i++) {
        if(arr.indexOf(arr[i]) == arr.lastIndexOf(arr[i])) {
            answer += arr[i];
        }
    }
    
    
    return answer;
}