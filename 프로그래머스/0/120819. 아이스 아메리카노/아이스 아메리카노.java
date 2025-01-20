class Solution {
    public int[] solution(int money) {
        
        // 담을 배열
        int[] answer = new int[2];
        
        // 잔 수
        int count = money / 5500;
        
        // 잔돈
        int change = money - 5500 * count;
    
        answer[0] = count;
        answer[1] = change;

        
        return answer;
    }
}