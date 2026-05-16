package Stack;

class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;

    }


}
class stack1{
    Node top;
    public stack1(){
        this.top=null;

    }
    void push(int element){
        Node temp=new Node(element);
        temp.next=top;
        top=temp;


    }
    int pop(){
        int ele=top.data;
        top=top.next;
        return ele;
    }


}
public class StackLinkedList {
    public static void main(String[] args) {
        stack1 s=new stack1();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
