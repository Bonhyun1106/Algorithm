package exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class question02 {
	public static void main(String[] args) {
		int[] numbers = {100, 99, 1, 5, 0};
		
		Solution1 sol = new Solution1();
		int[] result = sol.solution(numbers);
		
		System.out.println(Arrays.toString(result));
	}
}

class Solution1 {
    public int[] solution(int[] numbers) {
    	int[] answer = {};
        
        List<Integer> sumList = new ArrayList<>();
        
        for(int startNum=0 ; startNum < numbers.length ; startNum++){
          for(int addNum=startNum+1 ; addNum < numbers.length ; addNum++){
        	  int sumNum = numbers[startNum] + numbers[addNum];
        	  if(sumList.indexOf(sumNum) < 0) sumList.add(sumNum);
          }
        }
        
        answer = new int[sumList.size()];
        
        for(int answerIdx = 0 ; answerIdx < sumList.size() ; answerIdx++){
            answer[answerIdx] = sumList.get(answerIdx);
        }
        
        Arrays.sort(answer);
        return answer;
    }
}