import java.util.*;
class fibRec{
    static void fibseries(int a,int b ,int n){
        if(n==0)return;
        int c =a+b;
        System.out.print(" "+c+"  ");
       fibseries(b, c,n-1);


    }
    public static void main(String[] args) {
        System.out.println("hello my dear ");
        int a=0;
        int b=1;
        System.out.print(a+" "+b);
        fibseries(a,b,10);
        
    

    }
}