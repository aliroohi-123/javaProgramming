class demo{
    demo(){
        System.out.println("i am constructor i am invoked automatically ");
    }
}
public class constructor {
    public static void main(String[] args) {
       // demo d1 =new demo();
       demo d1[]=new demo[3];
       for(int i=0;i<d1.length;i++){
        d1[i]=new demo();
       }
    }
}
