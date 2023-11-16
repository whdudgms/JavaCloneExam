package ch12;

// 정리해서 생각해 보자면 왜 이렇게 될까?
//자 처음 인스턴스를 생성해서 참조변수에 대입될 때 무조건 두 타입변수는 일치   (다형성 불가능 단 와일드카드 사용 Ok)
// 만약에 불일치해도 될 경우(? : 와일드카드) 자동 형변환되는 것 이다.
// 객체가 생성되고 대입되고 난 다음에는 타입변수 T E R 같은 게 전부
// 대입된 타입으로 형변환 되거나 바뀐다. 그래서 다형성 인정
import javax.swing.*;
import java.util.ArrayList;
interface Eatable {}
class Fruit implements Eatable {public String toString(){return "Fruit";}}
class Apple extends Fruit {public String toString(){return "Apple";}}
class Grape extends Fruit{public String toString(){return "Grape";}}
class Toy {public String toString(){return "Toy";}}
public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox = new Box<Fruit>();
        Box<Apple> appleBox = new Box<>();
        Box<Toy> toyBox = new Box<>();
        // Box<Grape> grapeBox = new Box<Apple>(); 타입 불일치시 에러발생

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple()); // 과일박스지만 만들고 나서는 다형성 OK

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        // appleBox.add(new Toy()); 에러. Box<Toy>에는 Apple을 담을 수 없음

        toyBox.add(new Toy());
        //toyBox.add(new Apple()); 토이 박스에는 불가능

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);

    }
}

class Box<T>{
    ArrayList<T> list = new ArrayList<T>();
    void add(T item) { list.add(item);      }
    T get(int i)     { return list.get(i); }
    ArrayList<T> getList() { return list;  }
    int size()       { return list.size(); }
    public String toString() { return list.toString();}

}
