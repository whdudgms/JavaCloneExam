package ch07;

// 내부 클래스에서 외부 멤버 접근
public class InnerEx3 {

    private int outerIv = 0;
    static int outerCv = 0;

    class InstanceInner3{
        int iiv = outerIv;
        int iiv2 = outerCv;
    }

    static class StaticInner{
        //int siv  = outerIv;
        static int scv = outerCv;
    }

    void myMethod(){
        int lv = 0;
        lv =3;
        final int LV = 0;

        class LocalInner{
            int liv = outerIv;
            int liv2 = outerCv;

           // int liv3 = lv;
            int liv4 = LV;
        }
    }

}
