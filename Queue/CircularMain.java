package Queue;
public class CircularMain {
    public static void main(String[] args){
        CircularQueue circularQueue=new CircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(6);
        System.out.println("size of the queue: "+circularQueue.size());
        circularQueue.display();
        circularQueue.enqueue(100);
        circularQueue.display();
        System.out.println(circularQueue.dequeue());
        circularQueue.display();
        circularQueue.enqueue(130);
        circularQueue.display();
        circularQueue.enqueue(150);
        circularQueue.display();
        circularQueue.enqueue(190);
        circularQueue.display();
       // System.out.println(circularQueue.dequeue());
        circularQueue.display();

    }
}
