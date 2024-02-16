public class findUnique {
    public static int findunique(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i < l; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 1 };
        int result = findunique(arr);
        System.out.println(result);
    }
}
