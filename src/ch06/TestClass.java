package ch06;

public class TestClass {

    void instanceMethod(){}
    static void staticMethod(){
    }

    void instanceMethod2(){
        instanceMethod();
        staticMethod();
    }

    static void staticMethod2(){
        //instanceMethod();
    }


}
