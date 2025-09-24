package operator;

public class OperatorEx1 {
    public static void main(String[] args) {
        //단항 연산자 : ++ --
        // ++ : +1의 개념, -- : -1의 개념
        int i=5; 
        i++; // i = i + 1;
        System.out.println(i); //6
        i--; // i = i - 1;
        System.out.println(i); //5 (i가 위의 6로 변경된 상태에서 다시 1 감소)

        // ++ --가 앞에 올 때도 있고, 뒤에 올 때도 있다. 
        // ++i, --i : 전위형  
        // i++, i-- : 후위형

        int j = 10;
        ++j;
        System.out.println(j); //11
        // 앞에 오나 뒤에 오나 결과는 동일하게 보인다. 그러나, 변수를 어떻게 사용하느냐에 따라 결과가 달라진다. 


        // k가 아닌, l을 유심히 지켜보자. (l에 k가 들어가기 때문)

        int k=5, l=0;
        l = k++; // 1=k; k++;이 차례로 실행되는 개념 / l에 k가 1씩 늘어나는 것이 들어간다. / l은 증가되기 전의 값을 가져간다. 
        System.out.println("l = k++; 실행 후, k =" + k + ", l=" + l); // k=6, l=5
        
        
        k=5;
        l=0;
        l=++k; // ++k; 1=k; k가 1 늘어난 상태에서 l에 들어간다. / 증가된 후의 값이 l에 들어간다.
        System.out.println("l = ++k; 실행 후, k =" + k + ", l=" + l); // k=6, l=6
        
        // ++와 --를 각각 하나씩 변수에 담으면 값이 달라질 수 있다는 점을 유의하자. (자바에만 해당되는 문제, 파이썬에는 없음)
        // 이해 못함
    }
}
