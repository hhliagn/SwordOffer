package com.lhh.swordoffer.array;

public class question4 {

    //二维数组中的查找
    public static boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0 || array[0].length == 0)
            return false;
        int M = array.length;
        int N = array[0].length;
        int m = 0;
        int n = N-1;
        while (m<=M-1 && n>=0){
            if (array[m][n] == target){
                return true; //这里会有一个先后判断的问题，导致数组越界
            }else if (array[m][n] > target){ //这里要注意判断的逻辑，是target > 还是 array[][] >
                n--;
            }else {
                m++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 7;
        boolean find = Find(target, arr);
        System.out.println(find);
    }
}
