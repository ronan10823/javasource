package lang;

public class ExceptionEx3 {
    public static void main(String[] args) {

        // 6. 
        try {
            String data1 = "a100";
            String data2 = args[0];
            int value = Integer.parseInt(data1);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("입력값 확인");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        } catch (Exception e) {     // Exception catch 구문은 부모이기에 맨 마지막에 위치
            System.out.println(e.getMessage());
        }

        // 6-1) 개별로 나눠서 작성해도 된다.
        try {
            String data2 = args[0];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인자 확인");
        }


        // 1. NullPointException
        // String str = null;  // null로 초기화 (기본 타입 int 등에는 초기화 불가)
        // Value v = null;
        // int i = null;
        // System.out.println(str);
        // // 1) 수정 전
        // System.out.println(str.length());  // NullPointException

        // // 2) NullPointException이 나오지 않게 하는 방법 
        // if (str != null) {
        //     System.out.println(str.length());
        // }

        // 2. ArrayIndexOutOfBoundsException
        /// 2-1) 수정 전
        // String data1 = args[0];
        // System.out.println(data1);
        
        /// 2-2) 수정 후
        // if (args.length ==1) {
        //     String data1 = args[0];
        //     System.out.println(data1);
        //     }
    
        // 3. NumberFormatExceotion

        /// 3-1) 수정 전
        // String data1 = "a100";
        // int value = Integer.parseInt(data1); 
        // System.out.println(value);
        
        /// 3-2) if가 아닌, try catch를 이용해 오류 해결
        // try {
        //     // Exception이 발생할 가능성이 있는 코드
        //     String data1 = "a100";
        //     int value = Integer.parseInt(data1); // <- 발생 가능성이 있는 코드
        //     System.out.println(value);
        // } catch (Exception e) {
        //     // Exception이 "발생"하면 해야 하는 작업
        //     /// 1번 방법) e.printStackTrace(); // 예외 사항을 추적하는 코드(중요!)
        //     // System.out.println(e.getMessage()); // run -> For input string: "a100"
        //     System.out.println("입력값 확인");
        //     // Exception은 NumberFormatException의 부모로, NFE을 포함한 모든 에러를 받아낼 수 있다. 
        //     // 그래서 Exception e를 작성한 것, 만일 NumberForException e로 넣었다고 해보자. 
        //     // try에 String data2 = args[0];과 같은 '예외 발생 가능성이 있는 코드'가 들어가고
        //     // 실제로 예외가 발생하면 
        // } catch (NumberFormatException e)
        //     System.out.println("입력값 확인");
        // } catch (ArrayIndexOutOfBoundsException e)
        //     System.out.println("입력값 확인");
        // }


        // 4. ClassCastException
        // Dog dog = new Dog();
        // changeDog(dog);
        // Cat cat = new Cat();
        // changeDog(cat);

    }

        // 4 -> 이럴때 ClassCastException 발생
    // 1) 수정 전
    // public static void changeDog(Animal animal) {
    //     Dog dog = (Dog) animal;
    // }
    // 2) 수정 후 (미리 if를 써서 오류가 나는 것을 막을 수 있다.)
    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
        Dog dog = (Dog) animal;
        }
    }
}
