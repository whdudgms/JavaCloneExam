package ch06;

public class BlookTest {

    static {
        System.out.println("static { }");
    }

    {
        System.out.println("{ }");
    }

    public BlookTest() {
        System.out.println("생성자");
    }

    public static void main(String[] args){
        System.out.println("BlockTest bt = new BlockTest();");
        BlookTest bt = new BlookTest();

        System.out.println("BlockTest bt2 = new BlockTest();");
        BlookTest bt2 = new BlookTest();
    }
}
