public class Urlify {

    public String toUrlifyString(String s1, int length){
        if(s1 == null || length <= 0){
            throw new IllegalArgumentException();
        }
        char[] array = s1.toCharArray();
        int value = s1.length() - length;
        int maxCounter = value/2;
        int count = 0;
        for(int i=array.length-1;i>=0;){
            if(array[i-value] == ' ' ){
                array[i]='0';
                array[i-1]='2';
                array[i-2]='%';
                i=i-3;
                count++;
                value = value-2;
            }else if(array[i-value] != ' '){
                array[i] = array[i-value];
                i--;
            }
            if(count == maxCounter){
               break;
            }
        }
        String result = new String(array);
        return result;
    }

    public static void main(String[] args){

        Urlify obj1 = new Urlify();
        System.out.println(obj1.toUrlifyString("abc rgf  ",7));
        System.out.println(obj1.toUrlifyString("abc",3));
        System.out.println(obj1.toUrlifyString("abc rgf cd    ",10));
        System.out.println(obj1.toUrlifyString(" ab0 0rgf u67      ",13));
    }
}
