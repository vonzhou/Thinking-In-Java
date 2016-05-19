package thinkinginjava.object;

/**
 * Created by Luyna on 2016/5/19.
 */
public class ObjectScope {
    public static void main(String[] args){
        {
            String s=new String("Luyna");
        }
        //System.out.println(s);     error:cannot resolve symbol 's'
        //the reference s vanishes at the end of the scope.
        // However, the String object that s was pointing to is still occupying memory

        {
            int x =10;
            {
               // int x=20;    error: variable x has already been defined
            }
        }
        int x=20; //OK
    }
}
