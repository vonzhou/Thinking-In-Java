package mythinking.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by vonzhou on 16/4/9.
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);

        Guard guard = new Guard();
        boolean b = guard.giveAccess();   // false, no access
        System.out.println(b);

        // bypass
        Field field = guard.getClass().getDeclaredField("ACCESS_ALLOWED");
        unsafe.putInt(guard, unsafe.objectFieldOffset(field), 42); // memory corruption

        b =  guard.giveAccess(); // true, access granted
        System.out.println(b);
    }
}


