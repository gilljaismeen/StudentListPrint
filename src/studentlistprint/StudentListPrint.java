/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentlistprint;

/**
 *
 * @author jaism
 */
public class StudentListPrint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // store and print student list
        
        Student[] list = new Student[3];       //declaration for array of object
        Student s1 = new Student();            //create an object for student class
        s1.setName("Peter");
        s1.setAge(21);
        
        Student s2 = new Student();
        s2.setName("John");
        s2.setAge(15);
        
         Student s3 = new Student();
        s3.setName("Preeti");
        s3.setAge(20);
        
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for(int i =0; i< list.length; i++)
        {
            System.out.println(list[i].getName() + " " + list[i].getAge());
        }
        
   
    }
    
}
