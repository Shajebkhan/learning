import java.util.Scanner;

public class sort_zerosAndOne {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }

    static void sortzeros(int[] arr) {
        int zeros = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                zeros++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (i < zeros) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array ");
        printArray(arr);
        sortzeros(arr);
        System.out.println();
        System.out.println("Sorted array ");
        printArray(arr);
    }

}