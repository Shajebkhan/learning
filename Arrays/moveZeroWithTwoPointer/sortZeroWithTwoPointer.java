public class sortZeroWithTwoPointer {
    public static void printArray(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortZero(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        // {0, 1, 0, 1, 0, 1}
        while (start < end) {
            if (arr[start] == 1 && arr[end] == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
            if (arr[start] == 0) {
                start++;
            }
            if (arr[end] == 1) {
                end--;
            }
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] ar = { 0, 1, 0, 1, 0, 1 };
        System.out.println("original array");
        printArray(ar);
        System.out.println();
        System.out.println("After sort");
        sortZero(ar);
    }
}
