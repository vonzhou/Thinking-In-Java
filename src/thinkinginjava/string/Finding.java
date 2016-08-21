package thinkinginjava.string;
import java.util.regex.*;
import static thinkinginjava.util.Print.*;

/**
 * find(x)  改变搜索匹配的起始位置
 */
public class Finding {
  public static void main(String[] args) {
    Matcher m = Pattern.compile("\\w+")
      .matcher("Evening is full of the linnet's wings");
    while(m.find())
      printnb(m.group() + "|");

    print();
    int i = 0;
    while(m.find(i)) {
      printnb(m.group() + "|");
      i++;
    }
  }
}
