public class WDL {
    public static void main(String[] args) {
        
        System.out.println(solution("LDLDW"));
    }
    public static String solution(String inputStr) {
        char currentCheck = 'W';
        String answ = "";
        StringBuilder sb = new StringBuilder(inputStr);
        while(sb.length() > 0) {
            for (int i = 0; i < sb.length(); i++) {
                char current = sb.charAt(i);
                if(current == 'W' && currentCheck == 'W'){
                    answ += "W";
                    sb.deleteCharAt(i);
                    currentCheck = 'D';
                } 
                if(current == 'D' && currentCheck == 'D'){
                    answ += "D";
                    sb.deleteCharAt(i);
                    currentCheck = 'L';
                }
                if(current == 'L' && currentCheck =='L'){
                    answ += "L";
                    sb.deleteCharAt(i);
                    currentCheck = 'W';
                } 
            }
            for (int i = 0; i < sb.length(); i++) {
                char current = sb.charAt(i);
                if(current != currentCheck){
                    if(i == sb.length() - 1){
                        if(currentCheck == 'W') currentCheck = 'D';
                        else if(currentCheck == 'D') currentCheck = 'L';
                        else if(currentCheck == 'L') currentCheck = 'W';
                    }
                }else break;
            }
        }
        return answ;
    }
}
