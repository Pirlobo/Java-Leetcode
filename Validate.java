public class Validate {
    public static void main(String[] args) {
      double number1 = 100.55;
      double number2 = 100.558;
      System.out.println(validateInput(number1));
      System.out.println(validateInput(number2));
    }
    public static boolean validateInput(double number){
        String str = Double.toString(number);
        String[] res = str.split("[.]", 0);
        if(res[1].length() > 2) return false;
        return true;
    }
}