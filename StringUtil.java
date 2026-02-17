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

  public static String sort(String s) {
    StringBuilder sb = new StringBuilder();
    char[] arr = s.toCharArray();

    for (int i=0;i<s.length()-1;i++) {
      for (int j=i+1;j<s.length();j++) {
        if ((int)arr[i]>(int)arr[j]) {
          char tmp = arr[i];
          arr[i] = arr[j];
          arr[j] = tmp;
        }
      }
    }

    for (char i : arr) {
      sb.append(i);
    }
    return sb.toString();
  }

  public static boolean areAnagrams(String a, String b) {
    String sortedA = sort(a);
    String sortedB = sort(b);

    return sortedA.equals(sortedB);
  }

  public static String mix(String a) {
    String[] splitted = a.split(" ");
    String[] res = new String[splitted.length];

    for (int i=0;i<splitted.length;i++) {
      char[] ch = splitted[i].toCharArray();
      char tmp = ch[0];
      ch[0] = ch[splitted[i].length()-1];
      ch[splitted[i].length()-1] = tmp;
      res[i] = new String(ch);
    }
    return String.join(" ", res);
  }
}