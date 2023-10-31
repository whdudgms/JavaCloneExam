package ch07;


// 이 코드는 원래 Point01에 기본 생성자가 없어서 에러가 발생했는데
// 다른 코드에 영향을 주므로 지금은 내가 추가했다.
// 이 코드에서 배울점은 생성자를 프로그래머가 주지 않으면 super();를 컴파일러가 추가해줌.
// 그리고 조상의 iv는 조상의 생성자로 초기화하는 게 맞다.
public class PointTest {
}

class Point01{
    int x;
    int y;

    Point01(){}
    Point01(int x, int y){
        this.x = x;
        this.y = y;
    }

    String getLocation(){
        return "x :" + x + ", y :"+ y;
    }
}

class Point3D01 extends Point01{
    int z;

    // 조상의 기본 생성자가 없어서 에러가 발생함
    Point3D01(int x, int y, int z){
        // 컴파일러가 super(); 호출한다.
        this.x = x;
        this.y = y;
        this.z = z;
    }

    String getLocation(){
        return "x :" + x + ", y :"+ y + ", z :" + z;
    }
}

