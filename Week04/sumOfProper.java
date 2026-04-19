public class sumOfProper {  
    public static int sumOfProper(int[] nums) {  
        int sum=0;  
        for (int i = 0; i<nums.length;i++){  
            if (nums[i]%(i+1)==0){  
                sum=sum+nums[i];  
            }  
        }  
        return sum;  
    }  
    public static void main (String[] args){  
        // test case 1  
        System.out.println(sumOfProper(new int[] {1, 2, 6})); // 9  
  
        // test case 2
        System.out.println(sumOfProper(new int[] {10, 25})); // 10  
    }  
}
