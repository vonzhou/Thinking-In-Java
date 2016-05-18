package mythinking.unsafe;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

/**
 * Created by vonzhou on 16/4/9.
 */
public class Test3 {
    public static void main(String[] args) throws Exception{
        Field f = Unsafe.class.getDeclaredField("theUnsafe");
        f.setAccessible(true);
        Unsafe unsafe = (Unsafe) f.get(null);

        A o1 = new A(); // constructor
        long res = o1.a(); // prints 1
        System.out.println(res);

        A o2 = A.class.newInstance(); // reflection
        res = o2.a(); // prints 1
        System.out.println(res);

        A o3 = (A) unsafe.allocateInstance(A.class); // unsafe
        res =  o3.a(); // prints 0
        System.out.println(res);

    }
}


