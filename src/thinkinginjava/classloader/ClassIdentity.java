package thinkinginjava.classloader;

import java.lang.reflect.Method;


public class ClassIdentity {

    public static void main(String[] args) {
        System.out.println("Main class classloader: " + ClassIdentity.class.getClassLoader());
        new ClassIdentity().testClassIdentity2();
    }


    // loadClass will delegate to parent ClassLoader
    public void testClassIdentity1() {
        String curPath = System.getProperty("user.dir");
//        System.out.println(curPath);

        // path to your class file
        String classDataRootPath = curPath + "/out/production/Thinking-In-Java/";
        FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath);
        FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);
        String className = "thinkinginjava.classloader.Sample";
        try {
            Class<?> class1 = fscl1.loadClass(className);
            Object obj1 = class1.newInstance();
            System.out.println("Sample classloader: " + class1.getClassLoader().toString());

            Class<?> class2 = fscl2.loadClass(className);
            Object obj2 = class2.newInstance();

            System.out.println(class1 == class2);

//            System.out.println(obj1);
//            System.out.println(obj2);

            Method setSampleMethod = class1.getMethod("setSample", Object.class);
            setSampleMethod.invoke(obj1, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // findClass will do it directly!
    public void testClassIdentity2() {
        String curPath = System.getProperty("user.dir");
        String classDataRootPath = curPath + "/out/production/Thinking-In-Java/";

        FileSystemClassLoader fscl1 = new FileSystemClassLoader(classDataRootPath);
        FileSystemClassLoader fscl2 = new FileSystemClassLoader(classDataRootPath);
        String className = "thinkinginjava.classloader.Sample";
        try {
            Class<?> class1 = fscl1.findClass(className);
            Object obj1 = class1.newInstance();
            System.out.println(class1.getClassLoader().toString());

            Class<?> class2 = fscl2.findClass(className);
            Object obj2 = class2.newInstance();

            System.out.println(class1 == class2);

            Method setSampleMethod = class1.getMethod("setSample", Object.class);
            setSampleMethod.invoke(obj1, obj2);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}