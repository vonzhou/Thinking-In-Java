package mythinking.statickeyword;

/**
 * Created by vonzhou on 16/4/10.
 */
public class StaticMemberMethod {
    public static int MAX = 1024;
    public static void foo(){
        System.out.println("foo()");
    }

    public static void main(String[] args) {
        System.out.println(StaticMemberMethod.MAX);
        StaticMemberMethod.foo();
    }
}
