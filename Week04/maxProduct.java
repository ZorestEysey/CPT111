public class maxProduct {  
    public static int maxProduct(int[] arr) {  
        if (arr.length < 2) {  
            return 0;  
        }  
  
        int max1, max2, min1, min2;  
        max1 = min2 = Math.max(arr[0], arr[1]);  
        max2 = min1 = Math.min(arr[0], arr[1]);  
  
        for (int i = 2; i < arr.length; i++) {  
            int num = arr[i];  
  
            if (num > max1) {  
                max2 = max1;  
                max1 = num;  
            } else if (num > max2) {  
                max2 = num;  
            }  
  
            if (num < min1) {  
                min2 = min1;  
                min1 = num;  
            } else if (num < min2) {  
                min2 = num;  
            }  
        }  
  
        return Math.max(max1 * max2, min1 * min2);  
    }  
    public static void main (String[] args){  
        // test case 1  
        System.out.println(maxProduct(new int[] {-10, 5, -2, 1, 6})); // 30  
  
        // test case 2
        System.out.println(maxProduct(new int[] {-1, 2})); // -2  
  
        // test case 3
        System.out.println(maxProduct(new int[] {1})); // 0  
    }  
}
