public class OneAway {
    public boolean isoneEditAway(String s1, String s2){
        if(s1 == null || s2 == null){
            throw new IllegalArgumentException();
        }
        if(s1.equals(s2)){
            return true;
        }
        String bigStr = "";
        String smallStr = "";
        int lenDiff = s1.length() - s2.length();
        System.out.println(lenDiff);
        if(lenDiff > 1 || lenDiff < -1){
            return false;
        }else if(lenDiff >= 0){
            bigStr = s1;
            smallStr = s2;
        }else{
            bigStr = s2;
            smallStr = s1;
        }
        System.out.println(smallStr+":"+bigStr);
        boolean oneReplacement = false;
        for(int i=0,j = 0; i<smallStr.length();i++,j++){
            System.out.println("in if: "+smallStr.charAt(i)+" : "+bigStr.charAt(j));
            if(smallStr.charAt(i) != bigStr.charAt(j)) {
                if(oneReplacement) {
                    return false;
                }
                oneReplacement = true;
                if(smallStr.length() != bigStr.length()){
                    i = i - 1;
                }
            }

        }
        return true;
    }

    public static void main(String[] args){
        OneAway obj1 = new OneAway();
        System.out.println(obj1.isoneEditAway("pale","ple"));
        System.out.println(obj1.isoneEditAway("pales","pale"));
        System.out.println(obj1.isoneEditAway("pale","bale"));
        System.out.println(obj1.isoneEditAway("pale","bake"));
        System.out.println(obj1.isoneEditAway("ea","d"));
    }
}
