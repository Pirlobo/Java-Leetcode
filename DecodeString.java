import java.util.*;
public class DecodeString {
    public static void main(String[] args) {
        System.out.println(decodeString("3[a2[c]]"));
    }
    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack<Integer>();
        Stack<String> result = new Stack<String>();
        
        String res = "";
        int index = 0 ;
        
        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = 10*count + s.charAt(index) - '0';
                    index += 1;
                }
                      counts.push(count);
            }else if(s.charAt(index) == '['){
                result.push(res);
                res = "";
                index += 1;
            }
            else if(s.charAt(index) == ']'){
                StringBuilder tempt = new StringBuilder(result.pop());
                int count = counts.pop();
                for(int i = 0 ; i < count; i++){
                    tempt.append(res);
                }
                res = tempt.toString();
                index++;
            }else{
                res += s.charAt(index);
                index++;
            }
        }
        return res;
    }
}
