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

    public static boolean isStrictlyIncreasing(int[] nums){
        int previousNum = nums[0];
        boolean isIncreasing = false;
        for (int i = 1; i < nums.length; i++){

            if(nums[i] > previousNum){
                isIncreasing = true;
                previousNum = nums[i];
            }
        }
        return isIncreasing;
    }

    public static boolean has23(int[] nums){
        boolean has2 = false;
        boolean has3 = false;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 2){
                has2 = true;
            }
            if(nums[i] == 3){
                has3 = true;
            }
        }
        if (has2 && has3){
            return true;
        }
        return false;
    }
}
