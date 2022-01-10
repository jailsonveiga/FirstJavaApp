public class TwoMakesTen {
    public static void main(String[] args){
        System.out.println("Return (true or false) if one of the integer (9 or 10) is (10) or their sum is (10): " + twoMakesTen(9, 10));
        System.out.println("Return (true or false) if one of the integer (9 or 9) is (10) or their sum is (10): " + twoMakesTen(9, 9));
        System.out.println("Return (true or false) if one of the integer (1 or 9)is (10) or their sum is (10): " + twoMakesTen(1, 9));
    }

    public static boolean twoMakesTen(int a, int b) {
        if(a == 10 || b == 10 || (a + b) == 10) {
            return true;
        }
        else{
            return false;
        }
    }
}
