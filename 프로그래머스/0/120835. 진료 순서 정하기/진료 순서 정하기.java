class Solution {
    public int[] solution(int[] emergency) {
        
        int[] answer = new int[emergency.length];
        
        // 0 ~ 2
        for(int i = 0; i < emergency.length; i++) {
            // count 0 
            int count = 0;
            // 1 ~ 2
            for(int j = 0; j < emergency.length; j++) {
                // 0 < 1
                if(emergency[i] < emergency[j]) {
                    // +1
                    count++;
                }
            }
            answer[i] = count + 1;
        }
        
        return answer;
    }
}