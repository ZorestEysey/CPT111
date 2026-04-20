public class twoSwappable {  
    public static boolean twoSwappable(String s1, String s2) {  
        if (s1 == null || s2 == null || s1.length() != 5 || s2.length() != 5)  
            return false;  
  
  
        int[] count = new int[26];  
        for (int i = 0; i < 5; i++) {  
            count[s1.charAt(i) - 'a']++;  
            count[s2.charAt(i) - 'a']--;  
        }  
        for (int c : count) if (c != 0) return false;  
  
  
        int[] evenCount = new int[26];  
        int[] oddCount = new int[26];  
  
        for (int i = 0; i < 5; i++) {  
            if (i % 2 == 0) {  
                evenCount[s1.charAt(i) - 'a']++;  
                evenCount[s2.charAt(i) - 'a']--;  
            } else {  
                oddCount[s1.charAt(i) - 'a']++;  
                oddCount[s2.charAt(i) - 'a']--;  
            }  
        }  
  
        for (int i = 0; i < 26; i++) {  
            if (evenCount[i] != 0 || oddCount[i] != 0) return false;  
        }  
  
        return true;  
    }  
    public static void main(String[] args){  
        // test case 1  
        System.out.println(twoSwappable("abcde", "cdabe")); // true  
  
        // test case 2
        System.out.println(twoSwappable("abcde", "edcba")); // true  
  
        // test case 3
        System.out.println(twoSwappable("abcde", "daceb")); // false  
    }  
}
