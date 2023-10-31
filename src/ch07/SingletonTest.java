package ch07;

final  class Singleton {
    private static Singleton s = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        if(s == null){
            s = new Singleton();
        }
        return s;
    }

}

  class SingletonTest {
    public static void main(String args[]){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1.equals(s2));

    }

}
