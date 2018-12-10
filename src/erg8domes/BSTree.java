/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erg8domes;

/**
 *
 * @author user
 */
public class BSTree {
    private TreeNode root;
    private int size;

    BSTree()
    {
        root = null;
    }
    
    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return root == null;
    }

    public void insertElement(int data)
    {
        if(isEmpty())
        {
            root = new TreeNode(data);
        }
        else
        {
            insertNode(data, root);
        }

        size++;
    }

    public void inOrderTraversal()
    {
        System.out.println("INORDER TRAVERSAL");
        inOrder(root);
        System.out.println();
    }

    public void preOrderTraversal()
    {
        System.out.println("PREORDER TRAVERSAL");
        preOrder(root);
        System.out.println();
    }

    public void postOrderTraversal()
    {
        System.out.println("POSTORDER TRAVERSAL");
        postOrder(root);
        System.out.println();
    }

    private int counter = 0;

    public Object[] sort()
    {
        Object[] newTable = new Object[size];

        System.out.println("SORT ");

        counter = 0;

        inOrderSort(root, newTable);

        return newTable;
    }

    private void inOrderSort(TreeNode node, Object[] table)
    {
        if(node == null)
        {
            return;
        }

        inOrderSort(node.getLeftNode(), table);
        table[counter++] = node.getNodeData();
        inOrderSort(node.getRightNode(), table);
    }

    private void insertNode(Object data, TreeNode node)
    {
        if(((Comparable)data).compareTo(((Comparable)node.getNodeData()))==0){
            return ;
        } 
        if(((Comparable)data).compareTo(((Comparable)node.getNodeData()))==-1){
            if(node.getLeftNode()==null){
                node.setLeftNode(new TreeNode(data));
            }
            else{
                insertNode(data,node.getLeftNode());
            }
        }
        else{
            if(node.getRightNode() == null){
                node.setRightNode(new TreeNode(data));
            }
            else{
                insertNode(data,node.getRightNode());
            }
        }
        
    
    }

    private void inOrder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        inOrder(node.getLeftNode());

        System.out.print(node.getNodeData() + " ");

        inOrder(node.getRightNode());
    }

    private void preOrder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        System.out.print(node.getNodeData() + " ");

        preOrder(node.getLeftNode());
        preOrder(node.getRightNode());
    }

    private void postOrder(TreeNode node)
    {
        if(node == null)
        {
            return;
        }

        postOrder(node.getLeftNode());
        postOrder(node.getRightNode());

        System.out.print(node.getNodeData() + " ");
    }

    public TreeNode getRoot() {
        return root;
    }
    
    public int numberOfNodes(){
        if(isEmpty()){
            return 0;
        }
        return size(root);
    }
    
    public int size(TreeNode node){
        if(node==null){
            return 0;
        }
        return size(node.getLeftNode())+size(node.getRightNode())+1;
    }
    
    public int numberOfNodes2(){
        if(isEmpty()){
            return 0;
        }
        int n=0;
        return size2(root,n);
    }
    
    public int size2(TreeNode node,int n){
        if(node==null){
            return n;
        }
        n=size2(node.getLeftNode(),n);
        n++;
        n=size2(node.getRightNode(),n);
        return n;
    }
    
    public int treeHeight(){
        return height(root);
    }
    
    public int height(TreeNode node){
        int left=0;
        int right=0;
        if(left>right){
            return left+1;
        }
        else{
            return right+1;
        }
    }
    
    public int treeHeight(Object data){
        TreeNode h=searchNode(data,root);
    if(h!=null){
        return height(h);
    }
    else{
        return -1;
    }
}
    
    public TreeNode searchNode(Object data,TreeNode node){
        if(((Comparable)data).compareTo(((Comparable)node.getNodeData()))==0){
            return node;
        }
        else if(((Comparable)data).compareTo(((Comparable)node.getNodeData()))==-1){
            if(node.getLeftNode()==null){
                return null;
            }
            else{
                return searchNode(data,node.getLeftNode());
            }
        }
        else{
            if(node.getRightNode()==null){
                return null;
            }
            else{
                return searchNode(data,node.getRightNode());
            }
        }
    }
    
    public TreeNode searchNode1(Object data,TreeNode node){
        TreeNode found=null;
        if(((Comparable)data).compareTo(((Comparable)node.getNodeData()))==0){
            return node;
        }
        if(node.getLeftNode()!=null){
            found=searchNode1(data,node.getLeftNode());
        }
        if(node.getRightNode()!=null){
            if(found==null){
                found=searchNode1(data,node.getRightNode());
            }
        }
        return found;
    }
}
