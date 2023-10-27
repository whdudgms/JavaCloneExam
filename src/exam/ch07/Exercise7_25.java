package exam.ch07;

class Outer {
    static class Inner{
        int iv = 200;
    }
}
public class Exercise7_25 {
    public static void main(String[] args){
       System.out.println(new Outer.Inner().iv);

    }
}
