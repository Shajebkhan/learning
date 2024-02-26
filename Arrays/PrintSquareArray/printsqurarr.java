public class printsqurarr {

    public static void printArray(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void reverse(int[] rv) {
        int i = 0, j = rv.length - 1;
        while (i < j) {
            int temp = rv[i];
            rv[i] = rv[j];
            rv[j] = temp;
            i++;
            j--;
        }
    }

    public static int[] sortSqureArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        int[] ans = new int[arr.length];
        int k = 0;
        while (left < right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ar = { -10, -3, 1, 2, 4, 5 };
        System.out.println("original array");
        printArray(ar);
        System.out.println();
        System.out.println("After sort");
        int ans[] = sortSqureArray(ar);
        reverse(ans);
        printArray(ans);

    }
}