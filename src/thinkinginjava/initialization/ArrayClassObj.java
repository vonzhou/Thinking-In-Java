package thinkinginjava.initialization;

// Creating an array of nonprimitive objects.
import java.util.*;
import static thinkinginjava.util.Print.*;

public class ArrayClassObj {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		print("length of a = " + a.length);
		
		for (int i = 0; i < a.length; i++)
			a[i] = rand.nextInt(500); // Autoboxing, here complete creating obj
		
		print(Arrays.toString(a));
	}
} 