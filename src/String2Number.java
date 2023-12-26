import static java.lang.Integer.parseInt;

public class String2Number {
    public static int stringToNumber(String str) {
        //TODO: Convert str into a number
        int nums = parseInt(str);
        return nums;
    }

    public static String twoStrings(String a, String b) {
        if (b.length() > a.length()) {
            return a + b.substring((b.length() - a.length()));
        }
        if (b.length() < a.length()) {
            return a.substring((a.length() - b.length())) + b;
        }
        return a + b;
    }

    public static String xInTwo(String a){
        if(a.charAt(0) == 'x' && a.charAt(1) == 'x'){
            return a.substring(2);
        }
        if (a.charAt(0) == 'x'){
            return a.substring(1);
        }
        if(a.charAt(1) == 'x'){
            return a.substring(0,1) + a.substring(2);
        }
        return a;
    }
}
