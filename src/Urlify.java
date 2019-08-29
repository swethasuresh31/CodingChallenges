public class Urlify {

    public String toUrlifyString(String s1, int length){
        if(s1 == null || length < 0){
            throw new IllegalArgumentException();
        }
        StringBuilder sb = new StringBuilder();
        char[] array = s1.toCharArray();
        for(int i=0;i<length;i++){
            if(array[i] == ' ' ){
                sb.append("%20");
            }else{
                sb.append(array[i]);
            }
        }
        System.out.println(sb.toString());

        return sb.toString();
    }

    public static void main(String[] args){

        Urlify obj1 = new Urlify();
        System.out.println(obj1.toUrlifyString("abc rgf     ",7));
        System.out.println(obj1.toUrlifyString("abc     ",3));
        System.out.println(obj1.toUrlifyString(" abc rgf     ",8));
        System.out.println(obj1.toUrlifyString("     ",0));
        System.out.println(obj1.toUrlifyString("ab0 0rgf u67     ",12));
    }
}
