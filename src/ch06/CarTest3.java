package ch06;

// 같은 객체일 경우 같은 종류의 iv요소를 가지므로 생성자에 다른 인스턴스를 전달해서
// 전달된 인스턴스의 iv요소들을 복사해서 새로운 인스턴스를 생성했다.
// 두 인스턴스중에서 값이 바뀌더라도 서로 영향을 미치지 않는다.

class Car3{
    String color;
    String gearType;
    int door;

    Car3() {
        this("white","auto",4);
    }

    Car3(Car3 c){
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }

    Car3(String color, String gearType, int door){
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

}
public class CarTest3 {
    public static void main(String[] args){
        Car3 c1 = new Car3();
        Car3 c2 = new Car3(c1);

        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);

        c1.door=100;	// c1의 인스턴스변수 door의 값을 변경한다.
        System.out.println("c1.door=100; 수행 후");
        System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
        System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
    }
}
