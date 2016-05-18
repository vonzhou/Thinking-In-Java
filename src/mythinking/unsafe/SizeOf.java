package mythinking.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashSet;

/**
 * Created by vonzhou on 16/4/9.
 */
public class SizeOf {
    public static Unsafe getUnsafe() throws Exception{
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);
        return unsafe;
    }
    public static long sizeOf(Object o) throws Exception{
        Unsafe u = getUnsafe();
        HashSet<Field> fields = new HashSet<Field>();
        Class c = o.getClass();
        while (c != Object.class) {
            for (Field f : c.getDeclaredFields()) {
                if ((f.getModifiers() & Modifier.STATIC) == 0) {
                    fields.add(f);
                }
            }
            c = c.getSuperclass();
        }

        // get offset
        long maxSize = 0;
        for (Field f : fields) {
            long offset = u.objectFieldOffset(f);
            if (offset > maxSize) {
                maxSize = offset;
            }
        }

        return ((maxSize / 8) + 1) * 8;   // padding
    }

    public static void main(String[] args) throws Exception{
        String s = "abc";
        System.out.println(sizeOf(s));
    }
}
