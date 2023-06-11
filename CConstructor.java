class demo{
    int a;
    demo(){
        System.out.println("this is me");
        a =5;
    }
    demo(demo c){
        if(a==5){
       System.out.println("you should call her");
       System.out.println("hrheheh");}
       else{
        System.out.println("hahahah");
       }
    }
    public void show(){

    }
}
public class CConstructor {
    public static void main(String[] args) {
        demo d1 =new demo();
        demo d2 =new demo(d1);
    }
}
