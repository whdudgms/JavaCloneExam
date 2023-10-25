package exam.ch04;

public class Exercise4_12 {
    public static void main(String[] args){

        //조건식
            int y;
            for (int x = 1; x <= 9; x++) {
                for (int i = 1; i <= 3; i++) {
                    System.out.printf("%d * %d = %2d    ", x , i, x * i);
                }
            }




/*
        for(int y = 0; y <=2; y++) {
            for (int x = 1; x <= 3; x++) {
                for (int i = 2; i <= 4; i++) {
                    if(i + (y*3) == 9)break;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
     */

    }
}
