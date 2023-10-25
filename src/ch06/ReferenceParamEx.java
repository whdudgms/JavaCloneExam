package ch06;

//이번에는 인자로 인스턴스의 주소를 전달해줬기 떄문에 change메서드에서 "주소.변수"로 접근해서 값을 변경했으므로 change 메서드 이후에서
// 변경
public class ReferenceParamEx {
    public static void main(String[] args){

        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = "+ d.x);
    }

    static void change(Data d){
        d.x = 1000;
        System.out.println("change() : x =" +d.x);
    }
}
