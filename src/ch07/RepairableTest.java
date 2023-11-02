package ch07;

// 서로 공통인 부분이 없는 클래스들을 관련짓기 위해서 interface를 만들어서 구현하게 만들어서
// 연관지어서 그걸 매개변수로 받아서 작업을 수행하는 프로그램을 작성
public class RepairableTest {
    public static void main(String[] args){

        Dropship dropship = new Dropship();
        Tank tnak = new Tank();

        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tnak);
        scv.repair(dropship);
        //scv.repair(marine);
    }
}


interface Repairable{ }

class Unit1{
    int hitPoint;
    final int MAX_HP;
    Unit1(int hp){
        MAX_HP = hp;
    }
}
class GroundUnit extends Unit1{
    GroundUnit(int hp){
        super(hp);
    }
}

class AirUnit extends Unit1 {
    AirUnit(int hp) {
        super(hp);
    }
}

class Tank extends GroundUnit implements Repairable{
    Tank(){
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString(){
        return "Tank";
    }
}

class Dropship extends AirUnit implements Repairable{
    Dropship(){
        super(125);
        hitPoint = MAX_HP;
    }
    public String toString(){
        return "Droship";
    }
}

class Marine extends GroundUnit{
    Marine(){
        super(40);
        hitPoint = MAX_HP;
    }
}

class SCV extends GroundUnit implements Repairable{

    SCV() {
        super(60);
        hitPoint = MAX_HP;
    }

    void repair(Repairable r){
        if( r instanceof  Unit1){
            Unit1 u = (Unit1)r;
            while(u.hitPoint!=u.MAX_HP){
                u.hitPoint++;
            }
            System.out.println(u.toString() + "의 수리가 끝났습니다.");
        }
    }

}