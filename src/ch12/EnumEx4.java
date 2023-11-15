package ch12;

abstract class MyEnum<T extends MyEnum<T>> implements Comparable<T>{
    static int id = 0;

    int ordinal;
    String name = "";

    public int ordinal(){return ordinal;}
}
public class EnumEx4 {
}
