import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
		System.out.println(Arrays.toString(new Solution().solution(record)));
	}
}

class Solution {
    public String[] solution(String[] record) {
    	HashMap<String, String> users = new HashMap<String, String>();
    	ArrayList<String[]> logs = new ArrayList<>();
    	for (String recordStr : record) {
    		String[] tokens = recordStr.split(" ");
    		if (tokens[0].equals("Enter")) {
    			users.put(tokens[1], tokens[2]);
    			logs.add(tokens);
    		} else if (tokens[0].equals("Change")) {
    			users.put(tokens[1], tokens[2]);    			
    		} else {	//	Leave
    			logs.add(tokens);
    		}
    	}
    	String[] answer = new String[logs.size()];
    	for (int i = 0; i < logs.size(); i++) {
    		String[] tokens = logs.get(i);
    		if (tokens[0].equals("Enter")) {
    			answer[i] = users.get(tokens[1]) + "님이 들어왔습니다.";
    		} else { // Leave
    			answer[i] = users.get(tokens[1]) + "님이 나갔습니다.";    			
    		}
    	}
    	
    	return answer;
    }
}