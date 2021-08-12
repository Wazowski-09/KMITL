
public class endecode {
    public static String enCode(String x) {
        String y = "";
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                y = y + " ";
            }
            else{
                y = y + ((char)(x.charAt(i)+3));
            }
        }
        return y;
    }
    public static String deCode(String x) {
        String y = "";
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == ' ') {
                y = y + " ";
            }
            else{
                y = y + ((char)(x.charAt(i)-3));
            }
        }
        return y;
    }
}