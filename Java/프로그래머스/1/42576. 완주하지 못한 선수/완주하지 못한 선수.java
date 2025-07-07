import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> countMap = new HashMap<>();
        
        // 참가자 이름별로 카운트 증가
        for (String name : participant) {
            countMap.put(name, countMap.getOrDefault(name, 0) + 1);
        }
        
        // 완주자 이름별 카운트 감소
        for (String name : completion) {
            countMap.put(name, countMap.get(name) - 1);
        }
        
        // 카운트가 1인 (즉, 완주하지 못한) 사람 찾기
        for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        
        return ""; // 예외 처리용, 항상 하나는 리턴된다고 가정
    }
}
