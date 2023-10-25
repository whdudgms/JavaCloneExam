package ch06;

// Static 메서드의 경우에는 인스턴스 생성 없이 호출 가능, main함수 기준Static 메서드의 경우에는 같은 클래스내에서 바로 메서드 호출해서 사용가능
// static접근자를 지우면 에러가 발생한다.
// im >
public class CallStackTest {
    public static void main(String[] args){
        firstMethod();
        secondMethdod();

    }

    void abc(){
        efg();
    }

    void efg(){
        abc();
    }


    static void firstMethod() {
        secondMethdod();
    }

    static void secondMethdod() {
        System.out.println("secondMethod()");
    }
}
