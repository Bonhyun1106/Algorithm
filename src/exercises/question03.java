package exercises;

import java.util.HashMap;

public class question03 {
	public static void main(String[] args) {
		String[] participant = {"mislav", "stanko", "mislav", "ana"};
		String[] completion = {"stanko", "ana", "mislav"};
		
		Solution3 sol = new Solution3();
		String answer = sol.solution(participant, completion);
		
		System.out.println(answer);
	}
}

class Solution3 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";

        // 해시
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String name : participant){
            map.put(name, map.getOrDefault(name, 0)+1);
        }
        for(String name : completion){
            map.put(name, map.get(name)-1);
        }
        for(String key : map.keySet()){
            if(map.get(key) != 0) answer = key;
        }
        
        return answer;
    }
}
