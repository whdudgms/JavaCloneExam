package ch11;

import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx1 {
    public static void main(String[] args) {
        Properties prop = new Properties(); //Map 인터페이스를 구현한 컬렉션 클래스

        //prop에 키와 값(key,value)를 저장한다.
        prop.setProperty("timeout", "30");
        prop.setProperty("language", "kr");
        prop.setProperty("size", "10");
        prop.setProperty("capacity", "10");

        Enumeration e = prop.propertyNames();
        while (e.hasMoreElements()) {
            String element = (String)e.nextElement();
            System.out.println(element + "=" + prop.getProperty(element));
        }

        prop.setProperty("size", "20");

        System.out.println("size = " + prop.getProperty("size"));
        System.out.println("capacity=" + prop.getProperty("capacity", "2000"));
        System.out.println("loadfactor=" + prop.getProperty("loadfactor", "0.75"));

        System.out.println(prop);
        prop.list(System.out);
    }
}
