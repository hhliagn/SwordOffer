package com.lhh.swordoffer.array;

public class question3 {

    //数组中重复的数字
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        for (int i = 0; i < length; i++) {
            int number = numbers[i];
            if (number != i && numbers[number] == number){ //有可能一开始就是在适当的位置导致成立 所以要加 number != i
                duplication[0] = number;
                return true;
            }
            swap(i, number, numbers);
        }
        duplication[0] = -1;
        return false;
    }

    private static void swap(int i, int number, int[] numbers) {
        int number1 = numbers[i];
        numbers[i] = numbers[number];
        numbers[number] = number1;
    }

    public static void main(String[] args) {
        int[] ints = {2, 1, 3, 0, 4};
        int length = ints.length;
        int[] ints1 = new int[1];
        duplicate(ints, length, ints1);
    }
}
