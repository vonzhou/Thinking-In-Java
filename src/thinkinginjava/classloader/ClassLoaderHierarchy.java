package thinkinginjava.classloader;

/**
 * Created by vonzhou on 16/7/2.
 */
public class ClassLoaderHierarchy {
    public static void main(String[] args) {

        System.out.println("classloader for HashMap: " + java.util.HashMap.class.getClassLoader()); // Bootstrap ClassLoader
        System.out.println("class loader for DNSNameService: " + sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());

        ClassLoader loader = ClassLoaderHierarchy.class.getClassLoader();
        while (loader != null) {
            System.out.println(loader.toString());
            loader = loader.getParent();
        }
    }
}
