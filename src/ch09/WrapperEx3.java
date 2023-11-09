package ch09;

public class WrapperEx3 {
    public static void main(String[] args){
        int i = 10;

        Integer intg = (Integer)i; //10
        Object obj = (Object) i; //10
        int i2 = intg + 10; // 20
        Long lng = 100L; //100
        long l = intg + lng; // 110

        Integer intg2 = new Integer(20);        int i3 = (int)intg2; //20
        Integer intg3 = intg2 + i3; //40

        System.out.println("i     ="+i);
        System.out.println("intg  ="+intg);
        System.out.println("obj   ="+obj);
        System.out.println("lng   ="+lng);
        System.out.println("intg + 10  ="+i2);
        System.out.println("intg + lng ="+l);
        System.out.println("intg2 ="+intg2);
        System.out.println("i3    ="+i3);
        System.out.println("intg2 + i3 ="+intg3);
    }
}
