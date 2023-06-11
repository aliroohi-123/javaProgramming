 import java.util.*;

class demo{
    String name;
     public void setdata(){
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter your name");
            name =sc.next();
     }
     public void getdata(){
        System.out.println(name);
     }
}
public class classes {
    public static void main(String[] args) {
        demo d =new demo();
        d.setdata();
        d.getdata();
    }
    
}
