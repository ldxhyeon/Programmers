function solution(my_string) {
    const regex = /[^0-9]/g;
    const result = my_string.split(regex).map(Number);
    let sum = 0;
    
    for(let i = 0; i < result.length; i++) {
        if(!isNaN(result[i])) {
            sum += result[i];
        }
    }
    
    return sum;

}