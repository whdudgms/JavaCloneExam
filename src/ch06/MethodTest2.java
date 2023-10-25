package ch06;



import org.junit.Test;

import static org.junit.Assert.*;

public class MethodTest2 {
    //Q2. 2차원 배열을 받아서 갯수를 세어서 반환하는 메소드를 작성하고 테스트하시오.

    int binggoCnt(int[][] board){
        int binggo =0;
        int[] count = {0,0,0,0};


        // coint[0]:가로,    count[1]:세로, :    count[2]:좌상우하,    count[3]:우상좌하
        for(int i =0; i < 5; i++){  // 전부 확인했으니 다음 줄로 이동 (가로 혹은 세로)
            if(count[0] ==5)binggo++; // 가로 빙고 증가!
            if(count[1] ==5)binggo++; // 세로 빙고 증가!
            count[1] = 0; // 가로빙고인지 확인 후 다시 0으로 초기화
            count[0] = 0; // 세로빙고인지 확인 후 다시 0으로 초기화
            for(int j =0; j < 5; j++){  // 한 줄 쭉 확인 (가로 혹은 세로)
                if(board[i][j] == 1) count[0]++; // 0 1 > 0 2 > . .
                if(board[j][i] == 1) count[1]++; // 1 0 > 2 0 > . .
            }
            if(board[i][i] == 1) count[2]++; // 0 0 > 1 1 > . .
            if(board[4-i][i] == 1) count[3]++; // 0 4 > 1 3 > . .
            if(count[2] == 5) binggo++; // 좌상우하 빙고 증가!
            if(count[3] == 5) binggo++; // 우상좌하 빙고 증가
        }




        return  binggo;
    }

    @Test
    public void test(){
        int[][] board = {
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(binggoCnt(board)==0);
    }

    @Test
    public void test1(){
        int[][] board = {
                {0,0,0,0,0},
                {1,1,1,1,1},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
        };
        assertTrue(binggoCnt(board)==1);
    }

    @Test
    public void test2(){
        int[][] board = {
                {0,1,0,0,0},
                {1,1,1,1,1},
                {0,1,0,0,0},
                {0,1,0,0,0},
                {0,1,0,0,0},
        };
        assertTrue(binggoCnt(board)==2);
    }

    @Test
    public void test3(){
        int[][] board = {
                {1,1,0,0,1},
                {1,1,1,1,1},
                {1,1,1,0,0},
                {1,1,1,1,0},
                {1,1,0,0,1},
        };
        assertTrue(binggoCnt(board)==5);
    }

    @Test
    public void test4(){
        int[][] board = {
                {1,1,1,1,1},
                {1,1,1,1,1},
                {1,1,1,0,1},
                {1,1,1,1,1},
                {0,1,0,0,1},
        };
        assertTrue(binggoCnt(board)==5);
    }

}
