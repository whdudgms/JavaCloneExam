package ch06;

class TvTest3 {
    public static void main(String[] args){
        Tv t1 =new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel값은 "+ t1.channel+"입니다.");
        System.out.println("t2의 channel값은 "+ t2.channel+"입니다.");

        t2 = t1;
        t1.channel = 7;
        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
        //서로 다른 인스턴스를 가르키던 참조변수 t1과 t2가 서로 같은 인스턴스를 가르키게 됐다.
    }
}
