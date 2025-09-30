package object;

public class ReferenceParam {
    public static void main(String[] args) {
        int[] x = {10}; // 요소 1개짜리 배열
        System.out.println(x[0]);
        change(x); 
        System.out.println("변경 후 : " + x[0]);
    }

    public static void change(int[] x) { //배열로 받아준다. 
        x[0] = 1000; //궁금한 것은 원본이 바뀌는 것인가? 실행 시 1000이 나오므로 yes. 
        System.out.println("change() : x = " + x[0]);
    }
    
}

