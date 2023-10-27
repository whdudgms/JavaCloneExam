package exam.ch07;

public class Exercise7_18 {
    static void action(Robot r){
        if(r instanceof DanceRobot){
            ((DanceRobot) r).dance();
        }else if(r instanceof  SingRobot){
            ((SingRobot) r).Sing();
        }else if(r instanceof  DrawRobot){
            ((DrawRobot) r).draw();
        }
    }
    public static void main(String[] args){
        Robot arr[] = { new DanceRobot(), new SingRobot(), new DrawRobot()};

        for(int i=0; i < arr.length ;i++){
            action(arr[i]);
        }
    }
}

class Robot{}

class DanceRobot extends Robot{
    void dance(){
        System.out.println("춤을 춥니다.");
    }
}

class SingRobot extends Robot{
    void Sing(){
        System.out.println("노래 부르기.");
    }
}

class DrawRobot extends Robot{
    void draw(){
        System.out.println("그림 그리기.");
    }
}
