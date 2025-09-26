package control;
 // break : switch 구문
//          자신이 포함된 가장 가까운 반복문 벗어나기
public class BreakEx1 {
    public static void main(String[] args) {
        int sum = 0, i = 0;
        while (true) {
            // break는 if 구문과 자주 사용
            // sum이 100 초과 시, 반복문 중지
            if (sum > 100)
                break;
            ++i;
            sum += i;
            // i에 대한 구문이 빠져있다.

        }
        System.out.println("i = " + i);
        System.out.println("sum = " + sum);
    }
}
