import java.util.HashSet;

public class FindIfStringIsUnique {

    public boolean hasUniqueCharacters(String s){
        if(s == null){
            throw new IllegalArgumentException();
        }
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

    public boolean bruteForceHasUniqueCharacters(String s) {
        if(s == null){
            throw new IllegalArgumentException();
        }
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args){

        //checking with data structures
        FindIfStringIsUnique obj = new FindIfStringIsUnique();
        System.out.println(obj.hasUniqueCharacters("abcd"));
        System.out.println(obj.hasUniqueCharacters("abbd"));
        System.out.println(obj.hasUniqueCharacters("0abc"));
        System.out.println(obj.hasUniqueCharacters(""));

        //checking without data structures
        System.out.println(obj.bruteForceHasUniqueCharacters("abcd"));
        System.out.println(obj.bruteForceHasUniqueCharacters("abbd"));
        System.out.println(obj.bruteForceHasUniqueCharacters("0abc"));

        try {
            System.out.println(obj.bruteForceHasUniqueCharacters(null));
        }catch(Exception e){
            System.out.println("illegal argument: "+e);

        }

        try {
            System.out.println(obj.hasUniqueCharacters(null));
        }catch(Exception e){
            System.out.println("illegal argument: "+e);

        }
    }

}

