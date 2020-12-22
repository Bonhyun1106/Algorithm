package exercises;

import java.util.Arrays;

public class question01 {
    public static void main(String[] args){
        Solution sol = new Solution();
        
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        
        int result = sol.solution(board, moves);
        System.out.println(result);
    }
}

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        int[] basket = new int[board.length * board[0].length];
        
        for(int move :moves){
        	int moveCrain = move-1;
        	
            for(int idx=0 ; idx<board[0].length ; idx++){ // 0~4 5회 반복
                int boardVal = board[idx][moveCrain];
                
                if(boardVal != 0){
                	board[idx][moveCrain] = 0;	// pop doll
                    basket[answer] = boardVal;
                    answer += countRemoveDolls(basket);
                    
                    break;
                }
            }// end inner-loop
        }// end outer-loop
        
        return answer*2;
    }
    
    private int countRemoveDolls(int[] basket){
        int removeDollCnt = 0;
        
        // 배열 검색 로직 추가 
        System.out.println(Arrays.toString(basket));
        removeDollCnt++;	// 동일 값이 있을때 ++  
        
        return removeDollCnt;
    }
}