/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erg8domes;

/**
 *
 * @author user
 */
public class Erg8Domes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matrix[] = {40, 15, 25, 50, 20, 10, 70, 55, 45, 5};

        BSTree tree = new BSTree();

        for(int i = 0; i < matrix.length; i++)
        {
            tree.insertElement(matrix[i]);
        }

        tree.inOrderTraversal();
        tree.preOrderTraversal();
        tree.postOrderTraversal();
        
        System.out.println();
        Student[] st=new Student[9];
        st[1]=new Student("teo","mastro",134);
        st[2]=new Student("teo","mastro",143);
        st[3]=new Student("teo","mastro",156);
        st[4]=new Student("teo","mastro",234);
        st[5]=new Student("teo","mastro",654);
        st[6]=new Student("teo","mastro",345);
        st[7]=new Student("teo","mastro",12);
        st[8]=new Student("teo","mastro",1);
        st[0]=new Student("teo","mastro",199);
        
        BSTree treeStudents = new BSTree();
        
        for(int i = 0; i < st.length; i++)
        {
            treeStudents.insertElement(st[i].getAm());
        }
        
        treeStudents.inOrderTraversal();
        treeStudents.preOrderTraversal();
        treeStudents.postOrderTraversal();
      
    }
}
