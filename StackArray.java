import java.util.*;
class stack{
    int arr[] =new int[3];
    int top =-1;
    public void push(int a){
        if(top==arr.length-1){
          System.out.println("overflow");
          return;
        }
        else{
          arr[++top]=a;
        }
        System.out.println("element pushed  "+a);
    }
    public int pop(){
        if(top==-1){
            System.out.println("underflow");
            return -1;
        }
        else{
          return   arr[top--];
        }
    }
   
}
public class StackArray {
    public static void main(String[] args) {
        stack s =new stack();
        //s.pop();
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop()+"  element poped");
        System.out.println(s.pop()+"  element poped");
        System.out.println(s.pop()+"  element poped");
        
        

    }
}
