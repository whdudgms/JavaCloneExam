package ch01;

public class Hello {
    public static void main(String[] args){

        int[] arr = {1, 2,2,4,4,4,2,4 , 5, 1, 2};
        int[] count = new int[6];

        for(int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }

        for(int i = 0; i <count.length;i++){
            System.out.println(count[i]);
        }

        for(int i = 0; i <6;i++){
            if(count[i] != 0) System.out.println(i);
        }

        int index= 0;
        for(int i = 0; i < count.length ; i++)
            for(int x = 0; x<count[i]; x++) {
                arr[index] = i;
                index++;
            }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}