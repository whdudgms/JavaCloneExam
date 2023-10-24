package exam.ch04;

public class Exercise4_12 {
    public static void main(String[] args){


        for(int y = 0; y <=2; y++) {
            for (int x = 1; x <= 3; x++) {
                for (int i = 2; i <= 4; i++) {
                    System.out.printf("%d * %d = %2d    ", i + (y *3), x, x * i + (y *3));
                    if(i + (y*3) == 9)break;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
    }
}
