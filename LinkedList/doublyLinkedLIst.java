class MyLinkedList {
    class Node{
        int val;
        Node prev;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
        Node head,tail;
        int size;



    public MyLinkedList() {
        head=new Node(0);
        tail= new Node(0);

        head.next=tail;
        tail.prev=head;

        size=0;
        
    }
    
    public int get(int index) {
        if(index<0 || index >= size) return -1;

        Node curr;
        if(index<size/2){
            curr= head.next;
            for(int i=0;i<index;i++){
                curr = curr.next;

            }
        }else{
            curr=tail.prev;
            for(int i=size-1;i>index;i--){
                curr=curr.prev;

            }
        }
        return curr.val;


        
    }
    
    public void addAtHead(int val) {
        Node node = new Node(val);

        node.next=head.next;
        node.prev=head;

        head.next.prev=node;
        head.next=node;

        size++;
        
        
    }
    
    public void addAtTail(int val) {

        Node node = new Node(val);

        node.prev=tail.prev;
        node.next=tail;

        tail.prev.next=node;
        tail.prev=node;

        size++;
        
    }
    
    public void addAtIndex(int index, int val) {
        if(index < 0 || index>size) return;

        Node prev,next;

        if(index<size/2){
            prev=head;
            for(int i=0;i<index;i++){
                prev=prev.next;

            }
            next=prev.next;

        }else{
            next=tail;
            for(int i=size;i>index;i--){
                next=next.prev;
            }
            prev=next.prev;
        }

        Node node = new Node(val);
        node.prev=prev;
        node.next=next;

        prev.next=node;
        next.prev=node;

        size++;
        
    }
    
    public void deleteAtIndex(int index) {

        if(index <0 || index >=size) return;

        Node curr;

        if(index<size/2){
            curr=head.next;
            for(int i=0;i<index;i++){
                curr=curr.next;

            }


        }else{
            curr=tail.prev;
            for(int i=size-1;i>index;i--){
                curr=curr.prev;

            }
        }
        curr.prev.next=curr.next;
        curr.next.prev=curr.prev;

        size--;
        
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
