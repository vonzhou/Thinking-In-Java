package mythinking.unsafe;

import sun.misc.Unsafe;

/**
 * Created by vonzhou on 16/4/9.
 */
public class Test1 {
    public static void main(String[] args) {
        Unsafe unsafe = Unsafe.getUnsafe(); // SecurityException
    }
}
