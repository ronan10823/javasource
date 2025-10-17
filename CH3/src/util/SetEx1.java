package util;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetEx1 {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        // 추가 : add
        set1.add("사과");
        set1.add("배");
        set1.add("수박");
        set1.add("귤");
        set1.add("키위");
        set1.add("단감");
        set1.add("메론");
        set1.add("딸기");
        set1.add("딸기");
        System.out.println(set1);

        // 삭제 : remove
        set1.remove("수박");
        System.out.println(set1);



        // 수정 : X, 중간 삽입 : X
        // set1.set();
        //       └ set을 쓰려고 하면 붉은 줄이 나면서, 메서드가 없으므로 set은 사용 불가


        // 전체 조회
        for (String str : set1) {
            System.out.println(str);
        }
        
        // 특정 조회
        // set.get() X
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str);
        }
    }
}
