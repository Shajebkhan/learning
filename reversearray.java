public class reversearray {
    public static void ReverseArray(int[] arr) {
        int l = arr.length;
        for (int i = l - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        return; // optional bcose (type void)
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        ReverseArray(arr);
    }
}
