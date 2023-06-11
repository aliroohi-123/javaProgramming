 interface  car{
    public void speed();
    public void color();
 }
 interface fourwheeler extends car{
    public void run();
 }
 class bmw implements fourwheeler{
    public void speed(){
        System.out.println("i am fast");
    }
    public void color(){
        System.out.println("my color is black");
    }
    public void run(){
        System.out.println("running");
    }
 }
public class interface1 {
    public static void main(String[] args) {
       // car c1 = new bmw();
       bmw c1 =new bmw();
        c1.speed();
        c1.color();
        c1.run();
    }
}
