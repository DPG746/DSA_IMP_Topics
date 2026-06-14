import java.util.*;

class MinHeap1{

    public List<Integer> tree;

    public MinHeap1(){
        this.tree= new ArrayList<>();
    }

    public void insert(int data){
        System.out.println("Inserting :" +data);
        this.tree.add(data);
        this.balance(this.tree.size()-1);
        for(int i=0;i<this.tree.size();i++){
            System.out.println(this.tree.get(i) + " ");

        }
        System.out.println();

    }

    public void balance(int index){
        if(index>0){
            int parentindex=(index-1)/2;
            while(this.tree.get(index) <this.tree.get(parentindex)){
                swapNodes(index,parentindex);
                index=parentindex;
                parentindex=(index-1)/2;

            }

        }

    }


    private void swapNodes(int i,int j){
        System.out.println("Swapping :" + tree.get(i) + "and" + this.tree.get(j));
        int temp = this.tree.get(i);
        this.tree.set(i,this.tree.get(j));
        this.tree.set(j,temp);

    }

 

}

public class MinHeap{
    public static void main(String[] args){
        MinHeap1 minheap = new MinHeap1();

        minheap.insert(10);
        minheap.insert(7);
        minheap.insert(11);
        minheap.insert(6);
    }
}