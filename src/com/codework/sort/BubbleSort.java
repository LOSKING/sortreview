package com.codework.sort;

public class BubbleSort {
    public int[] bubbleSort(int[] array) {
//        结果集
        int[] result = new int[array.length];
        int min = 0;
//      遍历结果集
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
//              从头到尾比较取得最小值
                if (i == j) {
                    min = array[j];
                    continue;
                }
                if (min <= array[j]) {
                    continue;
                }
                //交换结果
                int temp = min;
                min = array[j];
                array[j] = temp;

            }
            result[i] = min;

        }


        return result;
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int[] data = {3, 1, 6, 2, 9, 4, 0,-1,-55};
        for (int t : bubbleSort.bubbleSort(data)) {
            System.out.println(t);
        }

    }
}
