package ch07;


// 조상의 클래스에 iv x 의 요소가 자손 클래스를 생성해서 호출했을 때
// super.x this.x x 모두 같다. 이유는 조상과 자손에 같은 이름의
// iv 요소가 없기 때문이다.
public class SuperTest {
    public static void main(String[] args){
        Child c = new Child();
        c.method();
    }
}

class Parent{
    int x = 10;
}

class Child extends Parent{
    void method(){
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x="+ super.x);
    }
}
