package arrayTest;

import java.util.ArrayList;
import java.util.List;

public class Array1 {

    public static void main(String[] args) {
        System.out.println("321321");
        int[] array = {1, 2, 1, 7, 5, 11, 92, 4};
//        xuanZe(array);
//        maoPao(array);
        chaRu(array);
    }

    //冒泡

    public static void maoPao(int[] array) {
        for (int i = 1; i < array.length; i++) {
            boolean flag = true;
            for (int j = 0; j < array.length - i; j++) {
                if (array[j] >= array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        display(array);
    }

    //选择
    public static void xuanZe(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print("第" + i + "轮排序后的结果为:");
            display(array);
        }
    }

    public static void chaRu(int[] array) {
        int j;
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            j = i;
            while (j > 0 & temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = temp;
            System.out.print("第" + i + "轮排序后的结果为:");
            display(array);
        }
    }


    private static void display(int[] array) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            stringBuffer.append(array[i] + " ");
        }
        System.out.println(stringBuffer.toString());
    }
}
