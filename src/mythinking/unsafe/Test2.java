package mythinking.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by vonzhou on 16/4/9.
 */
public class Test2 {
    public static void main(String[] args) throws Exception{
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        System.out.println(unsafe.pageSize()); // 4K
        System.out.println(unsafe.addressSize()); // 8

    }
}
