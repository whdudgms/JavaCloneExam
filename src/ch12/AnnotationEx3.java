package ch12;

import java.util.ArrayList;

class NewClass1{
    int newField;

    int getNewField(){
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField(){
        return oldField;
    }
}
public class AnnotationEx3 {
    @SuppressWarnings("deprecation")     // deprecation관련 경고를 억제

    public static void main(String[]args) {
        NewClass1 nc = new NewClass1();

        nc.oldField = 10;
        System.out.println(nc.getOldField());

        @SuppressWarnings("unchecked")     // deprecation관련 경고를 억제

        ArrayList<NewClass1> list = new ArrayList<>();
        list.add(nc);

    }
}
