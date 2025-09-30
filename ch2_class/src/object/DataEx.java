package object;

public class DataEx {
    public static void main(String[] args) {
        // Data 인스턴스 생성 
        Data data = new Data();

        // 1. 직접 접근
        data.x = 10;
        change(data.x); //값
        System.out.println("change 호출 후 :" + data.x);
        change(data);
        System.out.println("change(Data d) 호출 후 :" + data.x);

        Data data2 = copy(data); //아래의 copy(Data d) 호출
        System.out.println("data2.x = " + data2.x);
    }

    public static Data copy(Data d) {  // return 타입이 클래스 Data가 되었다. 
        Data tmp = new Data();
        tmp.x = d.x;
        return tmp; // 왜 Data d가 아니라 d만 해도 괜찮은 걸까. 머리가 멈췄어..
    }

    public static void change(Data d) { //객체 타입 
        d.x = 15;
        System.out.println("변경 후 " + d.x);
    }

    public static void change(int x){ //기초 타입 > 값의 복사 = 값이 바뀌지는 않는다.
        x=15;
        System.out.println("변경 후 "+x);
    }
}

// 매개변수의 차이