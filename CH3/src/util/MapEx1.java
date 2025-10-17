package util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        

        // 추가 - key와 value 값 선언
        map.put("1", "사과");
        map.put("2", "포도");
        map.put("3", "귤");
        map.put("4", "수박");

        // key값을 이용해 value 조회 // 도대체 어떻게? 원래는 String key = map.get("1");이었다고. 그런데 솔직히 왜 1이 들어가는지도 잘 모르겠어. 
        String value = map.get("1");
        System.out.println(value);

        // 전체 조회
        // key값을 interator 구조로 변경
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while (iter.hasNext()) {
            String key = iter.next();
            value = map.get("1"); // 왜 앞에 String이 붙으면 붉은줄이 나와?
            System.out.println(key + ":" + value); //iterator로 가져오는게 훨씬 코드가 간단하다. 근데, 왜 그걸 쓴거지? 
            // Map이고, 왜 Set을 쓰는데? key값은 중복되면 안되니까 Set을 쓰는 건가?
        }

    }
}
