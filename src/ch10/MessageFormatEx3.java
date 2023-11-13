package ch10;

import java.text.*;

public class MessageFormatEx3 {
    public static void main(String[] args) throws ParseException {
        String[] data = {
                "INSERT INTO CUST_INFO VALUES ('이길삼','02-123-1234',27,'07-09');",
                "INSERT INTO CUST_INFO VALUES ('홍삼식','032-333-1234',33,'10-07');"
        };

        String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
        MessageFormat mf = new MessageFormat(pattern);

        for(int i=0; i < data.length;i++) {//2
            Object[] objs = mf.parse(data[i]);
            for(int j=0; j < objs.length; j++) {//4
                System.out.print(objs[j] + ","); // 4출
            }
            System.out.println();
        }
    }
}
