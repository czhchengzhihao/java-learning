package com.study.cases;
/**
 * 自定义数据工具类
 */
public class ArrayUtil {
    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] arr = new int[]{-68, 89, 73, 54, -20, -89, -46, 85, 26, 76, 31};
        System.out.println(arrayUtil.getMax(arr));
    }

    /**
     * 求数组最大值
     *
     * @param arr
     * @return
     */
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 求数组总和
     *
     * @param arr
     * @return
     */
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 求数组总和
     *
     * @param arr
     * @return
     */
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 求数组平均值
     *
     * @param arr
     * @return
     */
    public int getAvg(int[] arr) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            avg = sum / arr.length;
        }
        return avg;
    }

    /**
     * 反转数组
     *
     * @param arr
     * @return
     */
    public void reverse(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    /**
     * 复制数组
     *
     * @param arr
     * @return
     */
    public int[] copy(int[] arr) {

        int[] copyArr = new int[arr.length];
        for (int i = 0; i < copyArr.length; i++) {
            copyArr[i] = arr[i];
        }
        return copyArr;
    }

    /**
     * 数组排序
     *
     * @return
     */
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 遍历数组
     *
     * @param arr
     * @return
     */
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "\t");
        }
    }

    /**
     * 查找指定元素
     *
     * @param arr
     * @param dest
     * @return
     */
    public int getValueIndex(int[] arr, int dest) {
        for (int i = 0; i < arr.length; i++) {
            if (dest == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}