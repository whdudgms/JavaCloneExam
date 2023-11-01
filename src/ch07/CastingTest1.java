package ch07;

// warter() 메서드는 FireEngine의 메서드이므로 참조변수가 Car형일 때 사용할 수 없다.
public class CastingTest1 {
    public static void main(String[] args){
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
        //car.water();
        fe2 = (FireEngine) car;
        fe2.water();

    }
}

class Car{
    String color;
    int door;

    void drive() { 		// 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() {		// 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("water!!!");
    }

}