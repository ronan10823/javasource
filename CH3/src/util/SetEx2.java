package util;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class SetEx2 {
    public static void main(String[] args) {
        // 1 ~ 45 -> 6개 숫자를 무작위로 추출
        // List와 Set 중 어디에 담을건지 결정할 수 있다. 

        Set<Integer> set = new HashSet<>();
        
        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random()*45) +1;
            set.add(num);
        }

        // 중복 없이, 6번 담을 수 있도록 처리해야 한다.

        System.out.println(set);

        // 오름차순으로 정렬
        // set.sort() X 
        // Collections.sort(set); -> List<T> list만 받는다. = 그러므로 set을 list로 변환하면 된다. 
        List<Integer> list = new LinkedList<>(set);
        Collections.sort(list);
        System.out.println(list);   

        list.forEach(null);

        Collections.sort(null);

        Set<Integer> set2 = new HashSet<>(list);
        System.out.println(set2);
    }
}
