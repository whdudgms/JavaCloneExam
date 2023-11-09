package ch09;

// 깊은 복사와 얕은 복사의 차이가 무엇일까 얕은 복사의 경우 새로운 객체를 만들어서 참조를 반환하기는 하지만 객체의 객체가 있을 경우 그 주소를 그대로 반환한다.
// 직 얕은 복사할 경우 c1 c1copy는 서로 다른 객체를 참조. c1 의 기본형 or c1copy의 기본형 변수를 변경시 서로 영향을 미치지 않는다.
// 그러나 객체의 객체를 변경하면 서로 값에 영향을 주게 된다.
//깊은 복사의 경우 객체의 객체까지 새로운 객체를 만들어서 대입하므로 값이 객체의 객체가 변경되어도 원본과 복사본 간에 서로 영향을 미치지 않는다.
class Circle implements Cloneable{
    Point p;
    double r;

    Circle(Point p, double r){
        this.p = p;
        this.r = r;
    }
    public Circle shallowCopy() {
        Object obj =null;

        try {
            obj = super.clone();
        }catch(CloneNotSupportedException e){}
        return (Circle)obj;
    }

    public Circle deepCopy(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch (CloneNotSupportedException e){
        }
        Circle c = (Circle)obj;
        c.p = new Point(this.p.x, this.p.y);

        return c;
    }
    public String toString(){
        return "[p = "+p+", r = "+r +"]";
    }
}

class Point{
    int x,y;

    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public String toString(){
        return "{ " +x+ " , "+y +" } ";
    }
}

public class ShallowDeppCopy {
    public static void main(String[] args){
        Circle c1 = new Circle(new Point(1,1),2.0);
        Circle c2 = c1.shallowCopy();
        Circle c3 = c1.deepCopy();

        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c3 = "+c3);

        c1.p.x = 1222;
        c1.p.y = 11;
        c1.r = 123.222;
        c2.r = 312.0;

        System.out.println();

        System.out.println(" 변경 후 ");

        System.out.println();

        System.out.println("c1 = "+c1);
        System.out.println("c2 = "+c2);
        System.out.println("c3 = "+c3);

    }
}
