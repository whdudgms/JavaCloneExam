package ch07;

// 매개변수로 인터페이스 사용하니까 인자로 전달될 객체가 바뀌어도 전혀 문제가 없이 잘 작동한다.
// 즉 A2 클래스를 바꿀 부분이 없다.
public class InterfaceTest2 {
    public static void main(String[] args){
        A2 a = new A2();
        a.autoPlay(new B2());
        a.autoPlay(new C2());
    }
}

class A2{
    void autoPlay(I2 i){
        i.play();
    }
}

interface I2 {
    public abstract void play();
}

class B2 implements I2 {
   public void play(){
       System.out.println("play in B class");
   }
}

class C2 implements I2{
    public void play(){
        System.out.println("play in C class");
    }
}

