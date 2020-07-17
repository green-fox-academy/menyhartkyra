public class substr2 {

  public static void main(String[] args) {
    //System.out.println(q.length());
    //System.out.println(q.charAt(0));
    System.out.println(substrk("this is what I'm in", "searching"));
  }

  public static int substrk(String input, String q) {
    int result = -1;
    int i;
    int k = 0;
    boolean last = false;
    outer:
    for (i = 0; i <= input.length() - q.length(); i++) {
      for (k = 0; k < q.length(); k++) {
        if (input.charAt(i + k) == q.charAt(k)) {
          if (k == q.length() - 1) {    //szó végére értünk
            result = i;
            break outer;
          }
          last = true;
          continue;
        }
        if (k > 0) {
          if (input.charAt(i + k) != q.charAt(k)) {
            result = -1;
            continue outer;              //előző egyezett mostnai nem
          }
        }
      }

    }
    return result;
  }

}
