import java.sql.SQLOutput;

public class CheckStringRotation {
    public boolean checkRotation(String s1, String s2){
        String newS1 = s1.concat(s1);
        if(isSubstring(newS1, s2)){
            return true;
        }
    return false;
    }

    public boolean isSubstring(String s1, String s2){
        if(s1.contains(s2)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        CheckStringRotation obj = new CheckStringRotation();
        System.out.println(obj.checkRotation("erbottlewat","waterbottle"));
        System.out.println(obj.checkRotation("bottlewat","waterbottle"));
        System.out.println(obj.checkRotation("rattlesound","soundrattle"));
    }

}
