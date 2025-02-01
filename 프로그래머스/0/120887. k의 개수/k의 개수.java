class Solution {
    public int solution(int i, int j, int k) {
        
        int answer = 0;
        
        // k의 값을 문자열로 변환
        String str = String.valueOf(k);
        
        // i 부터 j까지 반복문
        // ex) 1 ~ 13 까지
        for(int a = i; a <= j; a++) {
            // 1부터 13까지 문자열로 변환
            String value = String.valueOf(a);
            // 문자열로 변환한것중에 str 값이 있는지 확인 있다며 true
            if(value.contains(str)) {
                // 문자열이 있다면 배열 생성하여 배열로 값 대입
                String[] arr = value.split("");
                // 배열의 값을 alpha에 대입
                // alpha 문자열과 str 문자열이 같다면 asnwer++
                for(String alpha : arr) {
                    if(alpha.equals(str)) answer++;
                }
            }
        }
        
        return answer;
    }
}