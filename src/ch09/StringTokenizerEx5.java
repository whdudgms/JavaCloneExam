package ch09;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
    public static void main(String[] args){
        String data = "100,,,200,300";
        //1
        String[]  result = data.split(",");
        //2
        StringTokenizer st  =new StringTokenizer(data,",");


        //1
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i]+"|");
        }

        System.out.println("개수 : "+ result.length);

        int i = 0;
        // 2
        for(; st.hasMoreTokens(); i++){
            System.out.print(st.nextToken()+"|");
        }
        System.out.println("개수 : "+i);

    }
}
