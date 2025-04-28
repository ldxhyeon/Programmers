function solution(my_string) {
    const regex = /[^0-9]/g;
    // 정규식으로 숫자 배열 만들기
    // Number타입으로 변환하여 배열 만들기
    const result = my_string.split(regex).map(Number);
    let sum = 0;
    
    for(let i = 0; i < result.length; i++) {
        if(result[i] != 0) {
            sum += result[i];
        }
    }
    
    return sum;

}