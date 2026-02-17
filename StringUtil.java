package Lab3;

public class StringUtil {

  public static String reverse(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i=s.length()-1;i>=0;i--) {
      sb.append(s.charAt(i));
    }
    return sb.toString(); // return sb.reverse().toString(); as an alternative
  }

  public static String explode(String s) {
    StringBuilder sb = new StringBuilder();
    for (int i=0;i<s.length();i++) {
      for (int j=0;j<=i;j++) {
        sb.append(s.charAt(j));
      }
    } return sb.toString();
  }
}