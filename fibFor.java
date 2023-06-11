public class fibFor {
    public static void main(String[] args) {
        int a=0,b=1;
        int n=10;
        System.out.print(a+" "+b);
        for(int i=0;i<n-2;i++){
            int c=a+b;
            System.out.print(" "+c+" ");
            a=b;
            b=c;
        }
    }
}
