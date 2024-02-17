public class secondMAX {
    public static int FindMax(int [] arr) {
        int max = Integer.MIN_VALUE;

        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]> max) {
                max = arr[i];
            }
        }
        return max;
    }
     static int secondmax(int [] arr){
        int max = FindMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]== max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondmax = FindMax(arr);
        return secondmax;
    }
    public static void main(String[] args) {
        int [] arr = {1,23,5,55,66};
        System.out.println(secondmax(arr));
    }
}
