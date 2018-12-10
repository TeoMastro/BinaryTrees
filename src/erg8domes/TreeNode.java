/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erg8domes;

/**
 *
 * @author user
 */
public class TreeNode {
    private TreeNode left;
    private Object item;
    private TreeNode right;

    TreeNode(Object data)
    {
        item = data;
        left = right = null;
    }

    public Object getNodeData()
    {
        return item;
    }

    public TreeNode getLeftNode()
    {
        return left;
    }

    public TreeNode getRightNode()
    {
        return right;
    }

    public boolean isLeaf()
    {
        return right == null && left == null;
    }

    public void setLeftNode(TreeNode node)
    {
        left = node;
    }

    public void setRightNode(TreeNode node)
    {
        right = node;
    }

    public void setNodeData(Object data){
        item=data;
    }
    
    public String toString(){
        return item.toString();
    }
    
    public int compareTo(Object S) throws ClassCastException{
        if(!(S instanceof Comparable))
            throw new ClassCastException("A comparable object expected");
        return ((Comparable)item).compareTo(S);
    }
    
    
}
