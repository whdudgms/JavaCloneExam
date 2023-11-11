package ch10;

import java.util.*;
import java.text.*;
public class MessageFormatEx2 {
    public static void main(String[] args){
        String tableName = "CUST_INFO";
        String msg = "INSET INTO " +tableName +" VALUES (''{0}'',''{1}'',{2},''{3}'');";

        Object[][] arguments = {
                {"김길동","02-123-1234", "27", "07-09"},
                {"아재여ㅛ","032-333-1234", "33", "10-07"},
        };
        for(int i=0; i < arguments.length;i++) {
            String result = MessageFormat.format(msg, arguments[i]);
            System.out.println(result);
        }
    }
}
