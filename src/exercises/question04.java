package exercises;

import java.util.Arrays;
import java.util.Stack;

public class question04 {
	public static void main(String[] args) {
		int[] nums = {1,1,3,3,0,1,1};
		
		Solution4 sol = new Solution4();
		int[] answer = sol.solution(nums);
		
		System.out.println(Arrays.toString(answer));
	}
}

class Solution4 {
    public int[] solution(int []arr) {
       Stack<Integer> stack = new Stack<>();
    	
        for(int arrVal : arr){
        	if(!stack.isEmpty() && stack.peek() == arrVal) continue;
            stack.push(arrVal);
        }
        
        int[] answer = new int[stack.size()];
        
        for(int idx = answer.length-1 ; idx > -1 ; idx--) {
        	answer[idx] = stack.pop();
        }
        
        return answer;
    }
}