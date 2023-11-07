package ch08;

// 내가 예외가 발생한 곳에서 예외를 처리해주지 않고 던지면 호출한쪽에서 처리해줘야한다.
// 이 과정은 반복될 수 있으며 처리하지 않으면 컴파일 되지 않거나 오류가 발생할 수 있다.
//그리고 main에서 마저 던지면 JVM이 받아서 예외메세지를 출력한다
public class ExceptionEx12 {
    public static void main(String[] args) throws Exception{
        method1();
    }

    static void method1() throws Exception{
        method2();
    }

    static  void method2() throws Exception{
        throw new Exception();
    }
}
