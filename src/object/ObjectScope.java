package object;

/**
 * Created by Luyna on 2016/5/19.
 */
public class ObjectScope {
    public static void main(String[] args){
        {
            String s =new String("Luyna");
        }
       // System.out.println(s); cannot resolve symbol 's'
        //引用s的生命周期结束，新建的String对象仍然存在，但是没有任何引用指向它，因此无法再使用
    }
}
