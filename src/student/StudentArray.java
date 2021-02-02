/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author abdi_
 */
public class StudentArray {

    public static void main(String[] args) {
        Student[] studentList = new Student[5];
        Student student1 = new Student("Abdurahman Yussuf", 123);
        studentList[0] = student1;
        studentList[1] = new Student("Ali Hassan", 456);
        studentList[2] = new Student("Mohamed Ali", 789);
        studentList[3] = new Student("Ahmed Ali", 012);
        studentList[4] = new Student("Hassan Ali", 345);

        for (int i = 0; i < studentList.length; i++) {
            System.out.println(studentList[i].getName());
        }
    }
}
