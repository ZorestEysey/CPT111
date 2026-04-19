public class maxConsecutiveSum {  
    public static int maxConsecutiveSum(int[] arr){  
        if (arr == null || arr.length == 0) {  
            return 0;  
        }  
  
        int maxsum = arr[0];  
        int sum = arr[0];  
  
        for (int i = 1; i < arr.length; i++) {  
            sum = Math.max(arr[i], sum + arr[i]);  
            maxsum = Math.max(maxsum, sum);  
        }  
  
        return maxsum;  
    }  
    public static void main (String[] args){  
        // text case 1  
        System.out.println(maxConsecutiveSum(new int[]{-3, 5, -2, 3, -1})); // 6  
  
        // text case 2
        System.out.println(maxConsecutiveSum(new int[]{1, -1})); // 1  
    }  
}
