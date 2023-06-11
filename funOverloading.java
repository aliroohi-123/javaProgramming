public class funOverloading {
    static void show(int x){
        System.out.println(x);
    }
    static void show(int a,int b){
        System.out.println(a+" "+b);
    }
    static void show(int a,float b){
        System.out.println(a+" "+b);
    }
    static void show(float b){
        System.out.println(b);
    }
     static void show(int a,int b,int c){
        System.out.println(a+" "+b+" "+c);
    }
    static void show(char x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        show(12);
        show(1,3,2);
        show(12.0f);
    }
}
