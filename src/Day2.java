import java.util.Arrays;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {

//        int[] arr = {1, 4, 73, -53, 4, 12, 45, 0, 0, 0};
//        System.out.println("Nhập index:");
//        Scanner input = new Scanner(System.in);
//        int indexDel = input.nextInt();
//        for (int i = indexDel; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        arr[arr.length - 1] = 0;
//        System.out.println(Arrays.toString(arr));


//        int[] arr = {1, 4, 73, -53, 4, 12, 45, 0, 0, 0};
//        Scanner input = new Scanner(System.in);
//        System.out.println("Nhập số cần thêm:");
//        int num = input.nextInt();
//        System.out.println("Nhập index:");
//        int indexAdd = input.nextInt();
//        if (indexAdd <= -1 || indexAdd >= arr.length) {
//            System.out.println("Index không tồn tại");
//        } else {
//            for (int i = arr.length - 1; i > indexAdd; i--) arr[i] = arr[i - 1];
//            arr[indexAdd] = num;
//        }
//        System.out.println(Arrays.toString(arr));


//        int[] arr1 = new int[3];
//        int[] arr2 = new int[3];
//        int[] arr3 = new int[6];
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println("Thêm phần tử cho array 1:");
//            int element = input.nextInt();
//            arr1[i] = element;
//        }
//        System.out.println(Arrays.toString(arr1));
//        for (int i = 0; i < arr2.length; i++) {
//            System.out.println("Thêm phần tử cho array 2:");
//            int element = input.nextInt();
//            arr2[i] = element;
//        }
//        System.out.println(Arrays.toString(arr2));
//        for (int i = 0; i < arr1.length; i++) arr3[i] = arr1[i];
//        for (int i = 0; i < arr2.length; i++) arr3[i + arr2.length] = arr2[i];
//        System.out.println(Arrays.toString(arr3));


//        int[][] arr = {{12, 4, -2}, {44, -2, 23}};
//        double max = Double.NEGATIVE_INFINITY;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                if (arr[i][j] > max) {
//                    max = arr[i][j];
//                }
//            }
//        }
//        System.out.println(max);


        int[] arr = {53, 75, -22, 345, 666};
        double min = Double.POSITIVE_INFINITY;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);

    }
}
