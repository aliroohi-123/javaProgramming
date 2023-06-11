abstract class base{
    int a=3;
    public void show(){

    }
    public void checking(){

    }
}
class demo1 extends base{
    public void show(){
        System.out.println("i am member of first demo"+a);
    }
}
class demo2 extends base{
    public void show(){
        System.out.println("i am member of second demo");
    }
    public void checking(){
        System.out.println("checking");
    }
}
abstract class domain1 {
    abstract public void apply();

    
}
class exam extends domain1{
   public  void apply(){
       System.out.println("oh it is working");
    }
}
public class abstract1 {
    public static void main(String[] args) {
        demo1 d1 =new demo1();
        demo2 d2 =new demo2();
        d1.show();
        d2.show();

        d2.checking();
    }
}
