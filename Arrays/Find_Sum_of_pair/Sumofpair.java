package Arrays.Find_Sum_of_pair;
public class Sumofpair {

    static int Sumofpair(int arr[], int x) {
        
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 3, 2, 5 };
        int x = 7;
        System.out.println(Sumofpair(arr, x));
    }
}
