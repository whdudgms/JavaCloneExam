package ch07;

public class PointTest2 {
    public static void main(String[] args){
        Point3D02 p3 = new Point3D02();
        System.out.println("p3.x=" + p3.x);
        System.out.println("p3.y=" + p3.y);
        System.out.println("p3.z=" + p3.z);
    }
}

class Point02{
    int x = 10;
    int y = 20;

    Point02(int x, int y){
        this.x = x;
        this.y =y;
    }
}

class Point3D02 extends Point02{
    int z = 30;

    Point3D02(){
        this(100,200,300);
    }
    Point3D02(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

}
