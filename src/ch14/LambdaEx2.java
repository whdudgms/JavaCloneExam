package ch14;



    @FunctionalInterface
    interface Runnable{
        void myMethod();
    }
public class LambdaEx2 {
    public static void main(String[] args) {
        java.lang.Runnable f = () ->{};
        Object obj = (MyFunction)(() -> {});
        String str = ((Object)(MyFunction)(()->{})).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

        //System.out.println(()->{});	// 에러. 람다식은 Object타입으로 형변환 안됨
        System.out.println((MyFunction)(()-> {}));
//		System.out.println((MyFunction)(()-> {}).toString()); // 에러
        System.out.println(((Object)(MyFunction)(()-> {})).toString());

    }
}
