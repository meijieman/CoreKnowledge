package com.baidu.algorithm;

import java.util.Arrays;

public class MyClass {

    public static void main(String[] args) {

        int[] arr = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
//        int[] arr = {6, 1, 2, 7, 9, 3, 4, 6, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /**
     * 快速排序
     * 思路：
     * 从数列中取出一个数作为基准数，以其为分界将数列分为两个区。对每个区执行相同的操作，直到区间里只有一个数
     * <p>
     * 步骤：
     * 1. 将数组最左边元素作为基准数，定义两个指针i，j，分辨指向最左边和最右边
     * 2. 从右往左移动j指针，直到找到比基准数大的元素
     * 3. 从左往右移动i指针，直到找到比基准数小的元素
     * 4. 交换指针i 和 j 对应位置的元素，重复 2，3步骤直到 i 遇到 j
     * 5. 交换基准数和 i，j 相遇时对应的元素，这时会发现，基准数左边的元素都小于基准数，基准数右边的元素都大于基准数
     * 6. 以基准数将数组分为2个区，分别对以上两个区执行 1 -5 步骤。（分治法）
     */
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

//        int baseIndex = (left + right) / 2;
        int baseIndex = left;

        int i = left;
        int j = right;
        while (i != j) {
            while (j > i && arr[j] >= arr[baseIndex]) {
                j--;
            }

            while (i < j && arr[i] <= arr[baseIndex]) {
                i++;
            }

            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
        }

        int tmp = arr[baseIndex]; // 步骤5
        arr[baseIndex] = arr[i];
        arr[i] = tmp;

        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);

    }

    /**
     * 冒泡排序
     */


    /**
     * 双边冒泡排序
     */
}