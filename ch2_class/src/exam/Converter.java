package exam;

import java.util.Scanner;

public abstract class Converter {
    protected double ratio; // 멤버 변수

    abstract protected double convert(double src);
    abstract protected String getSrcString();
    abstract protected String getDestString();

    public void run() { //메소드
        Scanner scanner = new Scanner(System.in);
        System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다.");
        System.out.print(getSrcString() + "을 입력하세요 : ");
        double val = scanner.nextDouble();
        double res = convert(val);
        System.out.println("변환 결과: " + res + getDestString() + "입니다");
        scanner.close();

    
    }
}

// main에서는 run이라는 메소드만 호출했다.
// convert를 호출한다. val을 받아서, res로 컨버트 해서 