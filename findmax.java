public class findmax {
    public static int FindMax(int [] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int [] arr = {1,23,5,55,6};
        System.out.println(FindMax(arr));
    }
}
