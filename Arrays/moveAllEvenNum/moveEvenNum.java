public class moveEvenNum {
    public static int[] EvenMove(int [] arr) {
        
    int l = arr.length-1;
        int start = 0;
        int end = l;
        int temp;
        while (start<end) {
            if (arr[start]%2==1 && arr[end]%2==0) {
                temp = arr[start];
                arr[start]=arr[end];
                arr[end]= temp;
                start++;
                end--;
            }
            if (arr[start]%2==0) {
                start++;
            }
            if (arr[end]%0==1) {
                end--;
            }
        } 
        return arr;
        }
    
    public static void main(String[] args) {
        int [] ar= {1,2,3,4,5,6};
        EvenMove(ar);
             System.out.println(ar);
            
              
    }
}
