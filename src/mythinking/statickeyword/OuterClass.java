package mythinking.statickeyword;

/**
 * Created by vonzhou on 16/4/10.
 */
public class OuterClass {
    private String name;
    public static String NAME = "DefaultName";

    public OuterClass(String name){
        this.name = name;
    }

    class InnerClass{
        public  void show() {
            System.out.println("inner class , name = " + name + ", default name=" + NAME);
        }
    }

    static class StaticInnerClass{
        public void show(){
            System.out.println("static inner class , default name=" + NAME);
        }
    }

    public static void main(String[] args) {
        OuterClass.StaticInnerClass a = new OuterClass.StaticInnerClass();
        OuterClass o = new OuterClass("vonzhou");
        OuterClass.InnerClass b = o.new InnerClass();
        a.show();
        b.show();
    }
}
