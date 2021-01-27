package exercises;

import java.util.Stack;

public class question01 {
    public static void main(String[] args){
        Solution1 sol = new Solution1();
        
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        
        int result = sol.solution(board, moves);
        System.out.println(result);
    }
}

class Solution1 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        
        for(int move :moves){
        	int moveCrain = move-1;
        	
            for(int idx=0 ; idx < board.length ; idx++){
                int boardVal = board[idx][moveCrain];
                if(boardVal == 0) continue;
                
            	if(!basket.isEmpty() && basket.peek() == boardVal) {
            		basket.pop();
            		answer++;
            	}else{
            		basket.push(boardVal);
            	}
            	
            	board[idx][moveCrain] = 0;	// pop doll
                break;
               
            }// end inner-loop
        }// end outer-loop

        return answer*2;
    }
    
    
}
