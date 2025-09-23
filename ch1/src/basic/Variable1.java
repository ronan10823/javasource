package basic;

public class Variable1 {
    public static void main(String[] args) {
        // 변수를 선언 후 값 할당
        // (변수 선언 이유 > 저장하고 나중에 계속 사용하려고)
        int num = 10;
        int sum = num + 20;
        // num 사용 > num을 호출했다고 한다. 
        // 오른쪽부터 해석한다. 무조건. > num에 20을 더해서 
        System.out.println(num);
        System.out.println(sum);
        System.out.println("num 변수 값:"+num);
        System.out.println("num + 20 ="+sum);
        // println(괄호 안에서의 +는 산수가 아닌, 연결의 의미)
        // 그 결과는 num에 저장된 값이 출력된다. 

        System.out.printf("num 변수 값: %d", num);
        // println에서 ln>f로 변경 
        // 출력값: num 변수 값: 10age=25, maxSpeed=10
        // printf는 1. 줄바꿈이 없다. 2. ln은 +로 연결하지만 f는 %d라는 변수에 num이 들어가 출력
        System.out.printf("num 변수 값: %d\n", num);
        // 출력값: 
        // %d = 정수가 출력이 될거라는 의미


        int age = 25, maxSpeed = 10;
        // 변수 2개 선언, 타입은 int, 여러 개 선언 가능
        System.out.println("age = "+age+", maxSpeed="+maxSpeed);
        System.out.printf("age = %d, maxSpeed=%d", age, maxSpeed);
        System.out.printf("age = %d, maxSpeed=%d\n", age, maxSpeed);
        System.out.printf("age = %10d, maxSpeed=%5d\n", age, maxSpeed); // age =          25, maxSpeed=      10
        //자리수를 지정할 수 있더라

        // int num = 35;
        // Error : Duplicate local variable num > local 변수가 중복되어 있다. 
        // 중괄호 {} 안에서 동일한 변수를 두 번 선언할 수 없다. 

        num = 35;
        // num에 새로운 값인 35만 담는 것이다. 즉, num이라는 변수는 선언되었기에 그 값만 변경한 것.
        // 위에서 num 선언 > num이라는 변수가 메모리에 저장됨 > num이라는 변수에 위에서는 '10'을 작성, 아래에서는 num이라는 변수에 '35' 작성하면 그 아래부터는 num=35로 적용되어서 실행된다. 
        // num = 35f; 이렇게 사용할 수는 없다. 왜? num을 int로 선언했기 때문, f는 float에서만 사용

        final int MAX_SPEED = 20;
        // 상수 선언과 할당
        System.out.println(MAX_SPEED);
        // MAX_SPEED = 30;
        // Error: The final local variable MAX_SPEED cannot be assigned. It must be
        // blank and not using a compound assignment, 상수이기에 변경할 수 없다는 메시지

    }
}

