package mythinking.statickeyword;

/**
 * Created by vonzhou on 16/4/10.
 */
public class StaticBlock {
    private int member;
    public static String RESOURCE = "default";
    public StaticBlock(int member){
        this.member = member;
        System.out.println("my constructor invoke");
        System.out.println(StaticBlock.RESOURCE); // 此时静态初始化已经执行了
    }

    // static block <-> static initializer
    static {
        RESOURCE = "init";
        System.out.println("static block");
    }

    // non-static block <-> instance initializer
    {
        this.member = 1024;
        System.out.println("non-static block " + this.member);
    }

    public int getMember(){
        return this.member;
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock(3);
        System.out.println(sb.getMember());
    }
}
