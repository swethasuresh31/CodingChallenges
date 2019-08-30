import java.util.HashMap;

public class StringCompression {
    public String compressString(String s){
        if(s == null){
            throw new IllegalArgumentException();
        }
        if(s.equals("")){
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int rep = 0;
        char temp = s.charAt(0);
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == temp){
                rep++;
            }else{
                sb.append(temp);
                sb.append(rep);
                temp = s.charAt(i);
                rep = 1;
            }
            if(i == s.length()-1) {
                sb.append(temp);
                sb.append(rep);
            }

        }
        String result = sb.toString();
        if(result.length() >= s.length()){
            return s;
        }

        return result;
    }

    public static void main(String[] args){
        StringCompression obj1 = new StringCompression();
        System.out.println(obj1.compressString("aaabbaacc"));
        System.out.println(obj1.compressString("abbaacc"));
        System.out.println(obj1.compressString("aabbaacccc"));
        System.out.println(obj1.compressString("abc"));
        System.out.println(obj1.compressString("aaa"));
        System.out.println(obj1.compressString("   "));
        try {
            System.out.println(obj1.compressString(null));
        }catch(Exception e){
            System.out.println("Illegal Argument Exception :"+e);
        }


    }
}
