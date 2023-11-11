package ch10;

import java.util.*;
import java.text.*;
public class MessageFormatEx1 {
    public static void main(String[] args){

        String msg = "Name: {0} \nTel: {1} \nAge:{2} \nBirthday:{3}";

        String[] arguments = {"홍길동","010-1234-5432","33","07-20"};

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
