public class ValidateIPAddress {
    public static void main(String[] args) {
        String ip = "2001:0db8:85a3:0:0:8A2E:0370:7334";
        System.out.println(validIPAddress(ip));
    }
    public static String validIPAddress(String IP) {
        String ans = "";
        String[] splitedIPv4 = IP.split("\\.+");
        String[] splitedIPv6 = IP.split("\\:+");
        boolean IPv4 = validateIPv4(splitedIPv4);
        boolean IPv6 = validateIPv6(splitedIPv6);
        if (!isValidForm(IP)) {
            return "Neither";
        }
        if (IP.length() == 0 || IP.charAt(IP.length() - 1) == '.' || IP.charAt(IP.length() - 1) == ':') {
            ans = "Neither";
        }
        else if (IPv4) {
            ans = "IPv4";
        }
        else if (IPv6) {
            ans = "IPv6";
        }
        else if (!IPv6 && !IPv4) {
            ans = "Neither";
        }
        return ans;
    }
    public static boolean isValidForm(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            if ((s.charAt(i) == '.' && s.charAt(i + 1) == '.') || (s.charAt(i) == ':' && s.charAt(i + 1) == ':')) {
                return false;
            }
        }
        return true;
    }
    public static boolean validateIPv4(String[] nums) {
        if(nums.length != 4) return false;
        for(String string : nums){
            try {
                int convert = Integer.valueOf(string);
                if (string.length() == Integer.toString(convert).length() && convert >= 0 && convert <= 255) {
                    continue;
                }else{
                    return false;
                }
                
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }
    public static boolean validateIPv6(String[] nums) {
        if(nums.length != 8) return false;
        for (String string : nums) {
            if (string.length() >= 1 && string.length() <= 4) {
                for (int i = 0; i < string.length(); i++) {
                    if (!(Character.isDigit(string.charAt(i)) || String.valueOf(string.charAt(i)).equalsIgnoreCase("a") || String.valueOf(string.charAt(i)).equalsIgnoreCase("b") || String.valueOf(string.charAt(i)).equalsIgnoreCase("c") || String.valueOf(string.charAt(i)).equalsIgnoreCase("d") || String.valueOf(string.charAt(i)).equalsIgnoreCase("e") ||  String.valueOf(string.charAt(i)).equalsIgnoreCase("f"))) {
                        System.out.println(string.charAt(i));
                        return false;
                    }
                }
            }else{
                return false;
            }
        }
        return true;
    }
}