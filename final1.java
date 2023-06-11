final class demo{
    void show(){
        System.out.println("i am final no one can change me");
    }
}
class simple extends demo{

}
public class final1 {
    public static void main(String[] args) {
        demo d =new demo();
        d.show();
    }
}
