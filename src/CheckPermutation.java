import javax.swing.*;
import java.util.HashMap;

public class CheckPermutation {
    public boolean ifInputsPermutationOfEachOther(String s1, String s2){

        if((s1==null) || (s2 == null)){
            throw new IllegalArgumentException();
        }
        if(s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer> checkMap = new HashMap<>();

        //traversing through the first string and storing it in hash map as <"character",no of occurence>
       for(int i=0; i<s1.length();i++){
           int value = 1;
           if(checkMap.containsKey(s1.charAt(i))){
               value = checkMap.get(s1.charAt(i)) + 1;
               checkMap.put(s1.charAt(i), value);
           }
           else{
               checkMap.put(s1.charAt(i), value);
           }
       }

       //traversing through the second string and matching character occurences
        for(int i = 0;i<s2.length();i++){
            if(checkMap.containsKey(s2.charAt(i))){
                int value = checkMap.get(s2.charAt(i));
                if(value == 1){
                    checkMap.remove(s2.charAt(i));
                }else{
                    checkMap.put(s2.charAt(i), value-1);
                }
            }
        }

        if(!checkMap.isEmpty()){
            return false;
        }
        return true;
    }

    public static void main(String[] args){
        CheckPermutation obj1 = new CheckPermutation();


        System.out.println(obj1.ifInputsPermutationOfEachOther("abcd","dbca"));
        System.out.println(obj1.ifInputsPermutationOfEachOther("abcda","dbca"));
        System.out.println(obj1.ifInputsPermutationOfEachOther("abc0","0bca"));
        System.out.println(obj1.ifInputsPermutationOfEachOther("abcde","fbcae"));
        System.out.println(obj1.ifInputsPermutationOfEachOther("aacde","adcea"));
        System.out.println(obj1.ifInputsPermutationOfEachOther("aacde+","@adcea"));


        try{
            System.out.println(obj1.ifInputsPermutationOfEachOther(null,"@adcea"));
        }catch(Exception e){
            System.out.println("Illegal argument exception: "+e);
        }
    }

}
