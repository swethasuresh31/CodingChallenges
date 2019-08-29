import java.util.HashMap;

public class PalindromePermutation {
    public boolean isStringPermutationPalindrome(String s){
        if(s == null){
            throw new IllegalArgumentException();
        }
        HashMap<Character,Integer> checkMap = new HashMap<>();

        //i -pointer from 0 to string length
        //j - pointer from length to 0

        for(int i=0,j=s.length()-1;i<s.length();i++,j--){
            int value = 1;
            if(s.charAt(i) == ' ' || s.charAt(j) == ' '){
                continue;
            }else {
                //adding char to hashmap or increment value if already exists
                if (checkMap.containsKey(s.charAt(i))) {
                    value += checkMap.get(s.charAt(i));
                    checkMap.put(s.charAt(i), value);
                } else {
                    checkMap.put(s.charAt(i), value);
                }
                //removing char or decrementing value from hashmap
                if (checkMap.containsKey(s.charAt(j))) {
                    int decValue = checkMap.get(s.charAt(j));
                    if (decValue == 1) {
                        checkMap.remove(s.charAt(j));
                    } else {
                        checkMap.put(s.charAt(j), decValue - 1);
                    }
                }
            }
        }
        if(checkMap.size()>1){
            return false;
        }

        return true;
    }

    public static void main(String[] args){
        PalindromePermutation obj1 = new PalindromePermutation();
        System.out.println(obj1.isStringPermutationPalindrome("taco act"));
        System.out.println(obj1.isStringPermutationPalindrome("taco"));
        System.out.println(obj1.isStringPermutationPalindrome("mad am"));
        System.out.println(obj1.isStringPermutationPalindrome(""));
        System.out.println(obj1.isStringPermutationPalindrome(null));
    }

}
