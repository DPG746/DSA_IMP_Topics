import java.sql.SQLOutput;

class circularQueue1{
    int[] arr;
    int front;
    int rear;
    int capacity;
    int size;

    circularQueue1(int capacity){
        this.capacity=capacity;
        this.arr=new int[capacity];
        this.front=0;
        this.rear=-1;
        this.size=0;

    }

    void enqueue(int element){
        if(size==capacity){
            System.out.println("Queue is empty");

        }
        else{
            rear=(rear+1)%capacity;
            arr[rear]=element;
            size++;
        }

    }
    int dequeue(){
        if(size==0){
            System.out.println("Queue is empty");
            return -1;

        }
        else{
            int element=arr[front];
            front=(front+1)%capacity;
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
        return size==capacity;
    }

    boolean isEmpty(){
        return size==0;
    }

    int size(){
        return size;
    }

}
public class CircularQueue
{
    public static void main(String[] args) {
        circularQueue1 q = new circularQueue1(4);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.dequeue();
        q.dequeue();
        q.enqueue(70);
        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }

}

