package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {
    public static void main(String[] args) {
        // 시스템 날짜와 시간 가져오기 -> Date는 옛날에 많이 썼다.
        Date date = new Date();
        // └ sql과 util 중, util 선택
        System.out.println(date);      //  Thu Oct 16 15:49:15 KST 2025
        
        // yyyy : year -> 년도
        // MM : month -> 월
        // mm : minute -> 분
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        // Date를 보기 좋게 만드는 포맷 = SimpleDateFormat (Date와 같이 기억해도 괜찮다.)
        System.out.println(sdf.format(date));    // 2025년 10월 16일 03시 53분 54초
    }
}
