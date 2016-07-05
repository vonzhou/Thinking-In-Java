package mythinking.basic;

/**
 * Created by vonzhou on 16/6/15.
 */
public class Account {
    private final String _id = "a";

    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("mythinking.basic.Account");
        Account a = (Account)clazz.newInstance();
    }




}


