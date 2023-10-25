package ch06;



import org.junit.Test;

import static org.junit.Assert.*;

public class MethodTest3 {
    //Q2. 2차원 배열을 받아서 갯수를 세어서 반환하는 메소드를 작성하고 테스트하시오.

    int binggoCnt(int[][] board){
        int binggo =0;
        int[] count = {0,0,0,0};


        // 가로에서의 빙고
        for(int i =0; i < 5; i++){
            if(count[0] ==5)binggo++;
            count[0] = 0;
            for(int j =0; j < 5; j++){
                if(board[i][j] == 1) count[0]++;
            }
        }
        // 세로에서의 빙고
        for(int i =0; i < 5; i++){
            if(count[1] ==5)binggo++;
            count[1] = 0;
            for(int j =0; j < 5; j++){
                if(board[j][i] == 1) count[1]++;
            }
        }
        //좌상 우하에서의 빙고
        for(int i =0; i < 5; i++){
                if(board[i][i] == 1) count[2]++;
                if(count[2] == 5) binggo++;
        }
        //우상 좌하에서의 빙고
        for(int i =0; i < 5; i++){
            if(board[4-i][i] == 1) count[3]++;
            if(count[3] == 5) binggo++;
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
