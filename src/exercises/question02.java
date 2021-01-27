package exercises;

import java.util.Arrays;
import java.util.Stack;

public class question02 {
	public static void main(String[] args) {
		int[] numbers = {1, 1, 3, 3, 0, 1, 1};
		
		Solution2 sol = new Solution2();
		int[] result = sol.solution(numbers);
		
		System.out.println(Arrays.toString(result));
	}
}

class Solution2 {
    public int[] solution(int[] arr) {
    	Stack<Integer> stack = new Stack<>();
    	
        for(int arrVal : arr){
        	if(!stack.isEmpty() && stack.peek() == arrVal) continue;        	stack.push(arrVal);
        }
        
        int[] answer = new int[stack.size()];
        
        for(int idx = answer.length-1 ; idx > -1 ; idx--) {
        	answer[idx] = stack.pop();
        }
        
        return answer;
    }
}