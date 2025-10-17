package util;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
    public static void main(String[] args) {
        // Member 객체를 List에 담기

        List<Member> list1 = new ArrayList<>();
        //       └ 왜 안에 Member를 넣지?
        list1.add(new Member("hong12", "hong12", "홍길동"));
        list1.add(new Member("hong13", "hong13", "홍길동"));
        list1.add(new Member("hong14", "hong14", "홍길동"));
        list1.add(new Member("hong15", "hong15", "홍길동"));

        // 2번째 Member 조회
        Member member = list1.get(1);
        System.out.println("이름 "+member.getName());

        System.out.println();
        System.out.println("----------------------------");
        System.out.println("아이디\t비밀번호\t이름");
        System.out.println("----------------------------");
        // 전체 Member 조회
        for (Member mem : list1) {
            //       └ 위의 변수와 겹쳐서, member라고 하면 붉은줄이 생긴다.
            //       └ 향상된 for문으로 전체 변수를 조회
            System.out.printf("%s\t%s\t%s\n", mem.getId(), mem.getPassword(), mem.getName());            
        }
        
        // 만약 for i로 해야 하는 상황이 온다면?
        // for i는 인덱스를 지정할 수 있다는 특징이 있다.  
        System.out.println();
        for (int i = 0; i < list1.size(); i++) {
            //                  └ 
            Member mem = list1.get(i);
            //                  └ index에 있는 것을 직접 가져오기 위해서 get을 사용 -> 향상된 for문은 get이 자동으로 된다. 
            System.out.printf("%s\t%s\t%s\n", mem.getId(), mem.getPassword(), mem.getName());            
        }
    }
}
