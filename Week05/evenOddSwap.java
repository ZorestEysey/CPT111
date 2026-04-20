import java.util.Arrays;  
public class evenOddSwap {  
    public static int[] evenOddSwap(int[] input){  
        int[] nums=input.clone();  
        int[] oddloc=new int[nums.length/2];  
        int[] evenloc=new int[nums.length/2];  
        int oddcount=0,evencount=0;  
        for (int i=0;i<nums.length;i++){  
            if (nums[i]%2==1){  
                oddloc[oddcount]=i;  
                oddcount++;  
            }  
            else{  
                evenloc[evencount]=i;  
                evencount++;  
            }  
        }  
        for (int i=0;i<nums.length/2;i++){  
            int temp=nums[oddloc[i]];  
            nums[oddloc[i]]=nums[evenloc[i]];  
            nums[evenloc[i]]=temp;  
        }  
        return nums;  
    }  
    public static void main(String[] args){  
        // test case 1  
        System.out.println(Arrays.toString(evenOddSwap(new int[] {1, 2, 3, 4})));   // [2, 1, 4, 3]  
  
        // test case 2
        System.out.println(Arrays.toString(evenOddSwap(new int[] {100, 25})));   // [25, 100]  
  
        // test case 3
        System.out.println(Arrays.toString(evenOddSwap(new int[] {})));   // []  
  
        // test case 4
        System.out.println(Arrays.toString(evenOddSwap(new int[] {11, 55, 100, 200, 300, 7})));   // [100, 200, 11, 55, 7, 300]  
    }  
}
