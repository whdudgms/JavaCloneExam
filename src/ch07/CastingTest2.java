package ch07;

// 조상 자손 관계 형변환은 >> 컴파일은 OK 자손리모컨으로 실제 조상객체를 가르키게 되면 실행시 오류 발생함.
// 이런걸 막으려고 instanceof연산자를 사용함. ex자손(기능7) 조상(기능5){항상 자손이 기능 더 많음} 사용 불가능한 기능이 없어야하므로 에러발생
public class CastingTest2 {
    public static void main(String[] args){
        Car car = new Car();
        Car car2 = null;
        FireEngine fe = null;

        car.drive();
        fe = (FireEngine) car;
        fe.drive();
        car2 = fe;
        car2.drive();
    }
}
