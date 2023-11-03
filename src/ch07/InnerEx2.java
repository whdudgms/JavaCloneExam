package ch07;

public class InnerEx2 {
    // I C
    class InstanceInner2{}
    // S C
    static class StaticInner2{}

    InstanceInner2 iv = new InstanceInner2();
    static StaticInner2 cv = new StaticInner2();

    void instanceMethod(){
        InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();
    }

    static void staticMehtod(){
        //InstanceInner2 obj1 = new InstanceInner2();
        StaticInner2 obj2 = new StaticInner2();

        //굳이 static 메서드에서 인스턴스 클래스에 접근하는 법
        InnerEx2 outer = new InnerEx2();
        InstanceInner2 obj1 = outer.new InstanceInner2();
    }



    void myMethod(){
        class LocalInner{}
        LocalInner lv = new LocalInner();
    }

}
