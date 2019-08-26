import java.util.HashSet;

public class FindIfStringIsUnique {

    public boolean hasUniqueCharacters(String s){
        HashSet<Character> uniqueSet = new HashSet<>();
        for(int i=0; i<s.length();i++){
            if(uniqueSet.contains(s.charAt(i))){
                return false;
            }else{
                uniqueSet.add(s.charAt(i));
            }
        }
        return true;
    }

    public static void main(String[] args){
        FindIfStringIsUnique obj = new FindIfStringIsUnique();
        System.out.println(obj.hasUniqueCharacters("abcd"));
        System.out.println(obj.hasUniqueCharacters("abbd"));
        System.out.println(obj.hasUniqueCharacters("0abc"));
    }

}

