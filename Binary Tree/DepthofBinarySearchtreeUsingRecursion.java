//104. Maximum Depth of Binary Tree


class Treenode{
    int val;
    Treenode left;
    Treenode right;
    
    Treenode(int val){
        this.val=val;
    }
}
class Solution{
    public int maxDepth(Treenode root){
        if(root==null){
            return 0;
            
        }
        int l=maxDepth(root.left);
        int r=maxDepth(root.right);
        return Math.max(l,r)+1;
        
    }
}



class DepthofBinarySearchtreeUsingRecursion {
    public static void main(String[] args) throws java.lang.Exception {
        Treenode root= new Treenode(10);
        root.left=new Treenode(20);
        root.right= new Treenode(30);
        root.left.left=new Treenode(40);
        root.left.right=new Treenode(50);
        Solution s= new Solution();
        int depth=s.maxDepth(root);
        System.out.println("Maximum Depth is:"+ depth);
        
        
    
    }
}