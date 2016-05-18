package mythinking.unsafe;

/**
 * Created by vonzhou on 16/4/9.
 */
public class A {
    private long a; // not initialized value

    public A() {
        this.a = 1; // initialization
    }

    public long a() {
        return this.a;
    }
}
