package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        
        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("감");
        list.add("포도");
        list.add("바나나");

        // for (String string : list) {
        //     System.out.println(string);
        // }

        // for (String string : strArr) {
            
        // } // 향상된 for .문을 쓸 수 있다. 
        // 배열을 list로 변경해서 사용하고 싶다. 
        // List<String> list2 = Arrays.asList(strArr); 
        
        // 정렬(원본) 후 출력
        // list.sort(Comparator.naturalOrder());
        // System.out.println(list); // 
        
        String[] strArr = {"사과", "배", "감"};
        // Arrays.sort(strArr);
        // System.out.println(Arrays.toString(strArr));
        System.out.println();

        System.out.println("stream 처리");
        // 리스트를 Stream 으로 변경
        Stream<String> stream1 = list.stream();
        // 배열을 Stream 으로 변경
        Stream<String> stream2 = Arrays.stream(strArr);

        // Consumer<? super String> action 이 구조로 만들어야 한다.
        // consumer가 받을 수 있는 람다식을 넣어주면 된다.  
        stream1.sorted().forEach((x) -> System.out.println(x));
        stream2.sorted().forEach((x) -> System.out.println(x));
        System.out.println(list); // 원본 [ 사과, 감, 포도, 바나나 ]
        System.out.println(Arrays.toString(strArr)); // 스트림 [ 사과, 배, 감 ]
    }
}
