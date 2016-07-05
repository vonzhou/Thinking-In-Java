package thinkinginjava.classloader;

public class Sample {
    private Sample instance;

    public void setSample(Object instance) {
        this.instance = (Sample) instance;
        System.out.println("invoked!");
    }
}
