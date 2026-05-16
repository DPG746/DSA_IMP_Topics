import java.util.*;

class queue1{
    int[] arr;
    int front;
    int rear;
    int capacity;
    int size;

    queue1(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.front=0;
        this.rear=-1;
        this.size=0;

    }

    void enqueue(int element){
        if(rear==capacity-1){
            System.out.println("Queue is empty");

        }
        else{
            rear++;
            arr[rear]=element;
            size++;
        }

    }
    int dequeue(){
        if(front > rear){
            System.out.println("Queue is empty");
            return -1;

        }
        else{
            int element=arr[front];
            front++;
            size--;
            return element;
        }

    }
    int getFront(){
        if(size>0){
            return arr[front];

        }
        else{
            System.out.println("Queue is Empty");
            return -1;
        }
    }

    int getRear(){
        if(size>0){
            return arr[rear];

        }
        else{
            System.out.println("Queue is Empty");
            return -1;
        }
    }

    boolean isFull(){
        return rear==capacity-1;
    }

    boolean isEmpty(){
        return front>rear;
    }

    int size(){
        return size;
    }
}




public class Queue {
    public static void main(String[] args) {
     queue1 q = new queue1(6);
     q.enqueue(10);
     q.enqueue(20);
     q.enqueue(30);
     q.enqueue(40);
     q.dequeue();
     q.dequeue();
     System.out.println(q.getFront());
     System.out.println(q.getRear());

    }

}
