class treeNode{
    int data;
    treeNode left;
    treeNode right;
    
    treeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

class Tree1{
    static void preorder(treeNode root){
        if(root!=null){
            System.out.println(root.data+ " ");
            preorder(root.left);
            preorder(root.right);

        }

    }

}
public class preordertraversal {
     public static void main(String[] args){
       
        treeNode root=new treeNode(10);
        root.left=new treeNode(20);
        root.right=new treeNode(30);
        root.left.left=new treeNode(40);
        root.right.left=new treeNode(50);
        root.right.right=new treeNode(60);
        Tree1.preorder(root);

    }
    
}
