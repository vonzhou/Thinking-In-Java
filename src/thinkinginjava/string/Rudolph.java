package thinkinginjava.string;

/**
 * 这4个regex都能匹配 单词 Rudolph
 *
 */
public class Rudolph {
  public static void main(String[] args) {
    for(String pattern : new String[]{ "Rudolph", "[rR]udolph", "[rR][aeiou][a-z]ol.*", "R.*" })
        System.out.println("Rudolph".matches(pattern));
  }
}
