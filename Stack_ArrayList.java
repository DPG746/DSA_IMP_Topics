import java.util.*;


class StackUnderFlowException extends Exception{
    public StackUnderFlowException(){
        super("No element in Stack");
    }

}
class Stack{
    ArrayList al;
    int top;

    public Stack(){
        this.al=new ArrayList<Integer>();
        this.top=-1;

    }
    void push(int element){
        this.al.add(element);

    }
    int pop() throws StackUnderFlowException{
        if(this.al.size()==0){
            throw new StackUnderFlowException();

        }
        int last=this.al.size()-1;
        int t=(int) this.al.get(last);
        this.al.remove(last);
        return t;

    }
}

class Main{
    public static void main(String[] args){
        Stack s = new Stack();
        //s.push(10);
       // s.push(20);
       // s.push(30);
        s.push(40);
        System.out.println(s.pop());
        System.out.println(s.pop());

    }

}
