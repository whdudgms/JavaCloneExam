package ch06;

// main메서드를 시작으로 호출스택에 메서드가 호출되기 시작해서 mian 메서드에서 호출된 메서드가 있으면 그 메서드를 실행하고
//다시 main으로 돌아온다 다른 메서드에서 메서드를 호출할 경우에도 마찬가지이다.
public class CallStackTest2 {
    public static void main(String[] args){
        System.out.println("main(String[] args)이 시작되었음.");
        firstMethod();
        System.out.println("main(String[] args)이 끝났음.");
    }

    static void firstMethod(){
        System.out.println("firstMethod()이 시작되었음.");
        secondMethod();
        System.out.println("firstMethod()이 끝났음.");
    }

    static void secondMethod() {
        System.out.println("secondMethod()이 시작되었음.");
        System.out.println("secondMethod()이 끝났음.");
    }
}
