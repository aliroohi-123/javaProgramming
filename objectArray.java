class point{
    private int a,b,c;
    void input(int a,int b, int c){
        this.a=a;
        this. b=b;
        this.c=c;
    }
    void show(){
        System.out.println(a+" "+b+" "+c);
    }
}
public class objectArray {
    public static void main(String[] args) {
        point p[] =new point[5];
        for(int i=0;i<p.length;i++){
            p[i] =new point();
            p[i].input(i,i*2, 3*i);
            p[i].show();
        }
    }
}
