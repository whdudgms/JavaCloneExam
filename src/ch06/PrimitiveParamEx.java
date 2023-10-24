package ch06;

// 여기서 볼 점은 change메서드의 인자로 d.x를 전달했지만 main생성한 Data객체의 x값이 변경되지 않은 점이다.
// 이유는 객체의 주소를 전달한게 아니라 객체가 가진 변수(기본형)값을 전달했기 때문이다.
class Data{ int x; }
public class PrimitiveParamEx {
    public static void main(String[] args){
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x =" + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x){
        x = 1000;
        System.out.println("Change(): x = " + x);
    }
}
