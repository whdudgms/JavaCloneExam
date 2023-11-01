package ch07;

public class MyPoint {

}

class Point1{
    int x,y;

    Point1(){
        this(1,1);
    }
    Point1(int x, int y){
        this.x = x;
        this.y = y;
    }

        public String toString(){
            return "x의 값: "+x +" y의 값: "+y;
        }

    static double getDistance(Point1 p1,Point1 p2){
        return  Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) *1.0 + (p1.y - p2.y)*(p1.y - p2.y));
    }

    double getDistance(Point1 p){
        return  Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y)*(this.y - p.y));
    }

    //
    boolean equals(Point1 p){
        if("ch07.Point1"!=p.getClass().getName()) {
            return false;
        }
        if(this.x== p.x && this.y == p.y) {
            return true;
        }
        return false;
    }
}

class  Point3D extends Point1{
    int z;

    Point3D(int x, int y, int z){
        super(x,y);
        this.z = z;
    }

    Point3D(){
        super(1,1);
        this.z = 1;
    }

    public String toString(){
        return "x의 값: "+ x+"  y의 값: "+ y+"  z의 값: "+z;
    }


}

class PointTest1{
    public static void main(String[] args) {
        Point1 p = new Point1();
        p.x = 3;
        p.y = 5;
        Point1 p11 = new Point1(3,5);

        Point1 p2 = new Point1();

        //같은 Point1객체 x=3 y=5랑 서로 비교함 결과는 true가 맞음!
        System.out.println(p.equals(p11));
        System.out.println(p.toString());
        System.out.println("점 p와 p2의 길이"+p.getDistance(p2));


        Point3D p3d = new Point3D(10,10,10);

        Point3D p3d2 = new Point3D();

        //전부 (x,y,z)생성자로 초기화 10,10,10
        System.out.println(p3d);
        //기본 생성자로 초기화  1,1,1
        System.out.println(p3d2);


    }

}
