function solution(array, n) {
    // 오름차순
    let array2 = array.sort((a, b) => a - b);
    let absBox = 100;
    let answer = 0;
    
    for(let i of array2) {
        
        if(Math.abs(n-i) < absBox) {
            absBox = Math.abs(n-i);
            if(answer !== i)
                answer = i;
        }   
    }
    
    console.log(array2);
    
    
    return answer;
}