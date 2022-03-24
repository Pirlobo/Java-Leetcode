public class SimplifyPath {
    public static void main(String[] args) {
        String path = simplifyPath("/a/./b/../../c/");
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        // path = path.replaceAll("//","/");
        StringBuffer buff = new StringBuffer(path);
        for(int i = 0 ; i < buff.length() - 1; i++) {
            char current = buff.charAt(i);
            if (current == '.') {
                buff.deleteCharAt(i);
                i--;
            }
        }
        
        if (buff.charAt(buff.length() - 1) == '/') {
            buff.deleteCharAt(buff.length() - 1);
        }
        String result = buff.toString();
        for (int i = 0; i < result.length()/2 ; i++) {
            result = result.replaceAll("//", "/");
        }
        return result;
    }
}
