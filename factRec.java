public class factRec {
    static int fact(int n){
        int d=0;
        if(n==0){
            return 1
            ;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
