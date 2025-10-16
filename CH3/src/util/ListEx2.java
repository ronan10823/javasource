package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx2 {
    public static void main(String[] args) {
        // 리스트 생성   
        // ①★★부모 List★★     
        List<String> list1 = new ArrayList<>(30); // 값 30개로 지정 가능
        // ② ArrayList 생성
        ArrayList<String> list2 = new ArrayList<>();
        // ③ 직접 열거
        List<String> list3 = List.of("사과", "포도", "딸기", "수박"); 
        // ④ 배열로 리스트 생성
        String[] fruits = {"사과", "포도", "딸기", "수박"};
        List<String> list4 = Arrays.asList(fruits);


        list1.add("사과");
        list2.add("사과");
        // list3.add("바나나");  
        // list4.add("바나나"); // UnsupportedOperationException
        // list4.remove(0);
        // add, remove -> ③, ④에서 문제 발생 : 변경이 안되는데 변경했다는 메시지
        //                              └ 배열의 속성이 유지되면서 list를 생성해서, 변경을 못한다.

        // ④ 배열을 new로 생성 -> 문제 해결
        String[] fruits2 = { "사과", "포도", "딸기", "수박" };
        List<String> list5 = new ArrayList<>(Arrays.asList(fruits2));
        list5.add("바나나");

        // ③ 직접 열거도 new로 생성 -> 문제 해결 
        List<String> list6 = new ArrayList<>(List.of("사과", "포도", "딸기", "수박"));
        list6.add("바나나");

    }
}
