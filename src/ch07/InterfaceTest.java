package ch07;

// A가 B를 알고있다. B변경 >> A변경
// 인터페이스를 사용하자.
public class InterfaceTest {
    public static void main(String[] args){
        A a = new A();
        a.methodA(new B());
    }
}


class B {
    public void methodB(){
        System.out.println("methodB()");
    }
}

class A {
    public void methodA(B b){
        b.methodB();
    }
}
