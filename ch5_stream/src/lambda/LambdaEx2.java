package lambda;

public class LambdaEx2 {
    public static void main(String[] args) {
        Lambda4 lambda4 = () -> System.out.println("람다식");
        lambda4.run();

         System.out.println("-----------------------");
         execute(getRun()); // execute 사용 시, lambda 던져야 한다.
        //  return type = Lambda4  
    }

    // 함수형 인터페이스를 리턴 타입으로 사용 
    public static Lambda4 getRun(){
        Lambda4 lambda4 = () -> System.out.println("getRun");// 함수 하나 만들어서
        return lambda4; // 던져 
    }

    // 함수형 인터페이스를 매개 변수로 사용
    public static void execute(Lambda4 lambda4) {
        lambda4.run(); 
    }
}
