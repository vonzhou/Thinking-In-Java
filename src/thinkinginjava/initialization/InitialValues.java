package thinkinginjava.initialization;

//: initialization/InitialValues.java
// Shows default initial values.
import static thinkinginjava.util.Print.*;

public class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;

	void printInitialValues() {
		print("Data type      Initial value");
		print("boolean        " + t);
		print("char           [" + c + "]");
		System.out.println("[" + c + "]");
		System.out.println((int)c);
		System.out.println("abc" + "\0" + "abc");
		print("byte           " + b);
		print("short          " + s);
		print("int            " + i);
		print("long           " + l);
		print("float          " + f);
		print("double         " + d);
		print("reference      " + reference);
	}

	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
		/*
		 * You could also say: new InitialValues().printInitialValues();
		 */
	}
} 
