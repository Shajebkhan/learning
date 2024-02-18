import java.util.Arrays;

public class secondlargest {
    public static void sndlargest(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr);
            System.out.println(arr[arr.length - 2]);
            break;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 13, 7, 28, 12 };
        sndlargest(arr);
    }
}
