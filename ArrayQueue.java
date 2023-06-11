class queue{
    private int front =0,rare=-1;
    int arr[] =new int[3];
    public void enqueue( int item){
       if(rare==arr.length-1){
        System.out.println("queue is full");
        return;
       }
       else{
        arr[++rare]=item;
        System.out.println("element enqueued  "+item);
       }
    }
    public int dequeue(){
       // int item =arr[front];
        if(front==0){
         System.out.println("queue underflow");
         return -1;
        }
         int item =arr[front];
         if(front==rare)
          front = rare =-1;
        else
            front++;
            return item;
        
    }
}
public class ArrayQueue {
    public static void main(String[] args) {
        queue q =new queue();
       // q.enqueue(5);
      //  q.enqueue(3);q.enqueue(3);
       System.out.println(q.dequeue());
    }
}
