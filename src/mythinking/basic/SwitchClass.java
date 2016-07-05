package mythinking.basic;

/**
 * Created by vonzhou on 16/6/9.
 */
public class SwitchClass {
    public static void main(String[] args) {
        String branch = "hello";

        switch (branch){
            case "A":
                System.out.println("A");
                break;
            default:
                System.out.println("Default");
        }
    }
}
