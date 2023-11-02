package ch07;


// 인터페이스의 Default 메서드 와 static 메서드가 JDK1.8부터 추가됐다.
// static 메서드 인터페이스가 가지는 메서드. Default메서드 구현해도 안 해도 ok(몰랐는데 interface가 구현하기도 한다.)
// 인터페이스 메서드 vs 조상 상속 메서드 >> 조상상속메서드
// 복잡하면 그냥 오버라이딩 해주면 된다.
// static 메서드는 Interface명.staticMethod로 호출가능.


public class DefaultMethodTest {
    public static void main(String[] args){
        Child5 c = new Child5();
        c.method1();
        c.method2();
        MyInterface.staticMethod();
        MyInterface2.staticMethod();
    }
}

class Child5 extends Parent5 implements MyInterface, MyInterface2{
    public void method1(){
        System.out.println("method1() in Child");
    }
}

class Parent5{
    public void method2(){
        System.out.println("method2() in parent");
    }
}

interface MyInterface{
    default void method1() {
        System.out.println("method1() in MyInterface");
    }

    default void method2() {
        System.out.println("method2() in MyInterface");
    }

    static  void staticMethod() {
        System.out.println("staticMethod() in MyInterface");
    }
}

interface MyInterface2 {
    default void method1() {
        System.out.println("method1() in MyInterface2");
    }

    static  void staticMethod() {
        System.out.println("staticMethod() in MyInterface2");
    }
}