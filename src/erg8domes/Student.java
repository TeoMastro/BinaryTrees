/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package erg8domes;

/**
 *
 * @author user
 */
public class Student implements Comparable{
    public String lastName;
    public String firstName;
    public int am;
    
    public Student(String lastName,String firstName,int am){
        this.am=am;
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    public int getAm(){
        return am;
    }
    
    public int compareTo(Object S) throws ClassCastException{
        if(!(S instanceof Comparable))
            throw new ClassCastException("A comparable object expected");
        
        if (this.am < ((Student)S).am) {
            return -1;
        } 
        else if(this.am > ((Student)S).am){
            return 1;
        } 
        else{ 
            return 0;
        }

    }
}
