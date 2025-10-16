package util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListEx1 {
    public static void main(String[] args) {
        // String[] str1 = {" "};
        //     └ 배열에 String 넣을거임 
        // 선언과 동시에 초기화 가능
        
        List<String> list1 = new ArrayList<>();  // 선언
        //                            └ List()는 인터페이스라 호출이 안된다.
        //    └ 배열과 유사하게, <String> 타입을 담을거라 알려줌
        //                                 └ 두 번째 <>는 작성 필요x 
        // 추가 add -> append (뒤로 덧붙이기)

        list1.add("사과");
        list1.add("배");
        list1.add("수박");
        list1.add("귤");
        list1.add("키위");
        list1.add("단감");
        list1.add("메론");
        list1.add("딸기");
        // 뭘 담을지 알려줘

        System.out.println(list1); // [사과, 배, 수박, 귤, 키위, 단감, 메론, 딸기]
        //                               └ toString이 Overriding되어있구나
        System.out.println(list1.get(3));  // 귤

        System.out.println("리스트 요소 개수 " +list1.size()); // 7

        // remove : list.remove로 값을 지움
        list1.remove(0);
        System.out.println(list1);
        list1.remove("수박");
        System.out.println(list1);
        // list에 배를 한 번 더 추가하고, remove했는데 첫번째거 하나만 삭제하더라.


        // update : list.set으로 값을 변경
        list1.set(0, "포도");
        System.out.println(list1);


        // add(index:, element: ) : 중간 삽입
        list1.add(2, "딸기");
        System.out.println(list1);
        // └ 확인용


        // for : 하나의 값을 사용하려면 for문을 사용해야 한다.
        //                    ┌ 배열명(오른쪽에 온다)
        for (String string : list1) {
            System.out.println(string);
        //                       └ string이라는 변수에 하나씩 담아준다. 
        }

        
        // sort : 오름차순, 내림차순 정리 
        list1.sort(Comparator.reverseOrder());
        System.out.println(list1);
    }
}
