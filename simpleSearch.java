import java.util.*;
public class simpleSearch {
    public static void main(String[] args) {
        int array[] ={22,44,2,1,3,2,55,6,7,9};
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the no. you are looking for");
        int key =sc.nextInt();
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                System.out.println("key found  "+key);
                return;
            }
            
        }
        System.out.println("key not found");
    }
}
