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
    public static int blackJack(int a, int b){
        int nearest = 0;
        if(a > 21 && b > 21){
            return nearest;
        }
        if(a > 21){
            nearest = b;
            System.out.println(b);
        }
        if(a > b){
            nearest = a;
            System.out.println(a);
        }
        return nearest;
    }

    public static int findLargest(int[] arr){
        int largest = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i]> largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static String comboString(String a, String b){
        String combo = "";
        if(a.length() < b.length()){
            combo += a + b + a;
        } else{
            combo += b +a + b;
        }
        return combo;
    }
}
