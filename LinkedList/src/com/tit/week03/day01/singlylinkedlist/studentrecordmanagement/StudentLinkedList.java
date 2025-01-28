package com.tit.week03.day01.singlylinkedlist.studentrecordmanagement;

public class StudentLinkedList {
    StudentNode head;
    // Add at beginning
    public void addAtBeginning(int rollNumber , String name , int age , String grade){
        StudentNode newStudent = new StudentNode(rollNumber , name , age , grade);
        newStudent.next = head;
        head = newStudent;
    }
    // Add at end
    public void addAtEnd(int rollNumber , String name , int age , String grade){
        StudentNode newStudent = new StudentNode(rollNumber , name , age , grade);
        if(head == null){
            head = newStudent;
            return;
        }
        StudentNode temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newStudent;
    }
    // Add at a specific position
    public void addAtPosition(int position ,int rollNumber , String name , int age , String grade){
        if(position<=0){
            System.out.println("Invalid position");
            return;
        }
        StudentNode newStudent = new StudentNode(rollNumber, name, age, grade);
        // Insert at the beginning
        if (position == 1) {
            newStudent.next = head;
            head = newStudent;
            return;
        }

        StudentNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        // Check if the position is valid
        if (temp == null) {
            System.out.println("Position out of bounds");
        } else {
            newStudent.next = temp.next;
            temp.next = newStudent;
        }
    }
    // Delete by roll number
    public void deleteByRollNumber(int rollNumber) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        if (head.rollNumber == rollNumber) {
            head = head.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted");
            System.out.println();
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Student with Roll Number " + rollNumber + " not found");
            System.out.println();
        } else {
            temp.next = temp.next.next;
            System.out.println("Student with Roll Number " + rollNumber + " deleted");
            System.out.println();
        }
    }
    // Search by roll Number
    public void searchByRollNumber(int rollNumber){
        StudentNode temp = head;
        while(temp!= null){
            if(temp.rollNumber == rollNumber){
                System.out.println("Student Found: " + temp );
                System.out.println();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with RollNumber :" + rollNumber + " Not Found");
        System.out.println();
    }
    // Update by rollNumber
    public void updateByRollNumber(int rollNumber , String newGrade){
        StudentNode temp = head;
        while(temp!=null){
            if(temp.rollNumber == rollNumber){
                temp.grade = newGrade;
                System.out.println("Grade Updated for Roll Number: " + rollNumber);
                System.out.println();
                return;
            }
            temp = temp.next;
        }
        System.out.println("Student with Roll Number: " + rollNumber + " Not Found");
        System.out.println();
    }
    public void displayAllRecords(){
        if(head == null){
            System.out.println("No Records Found");
            System.out.println();
            return;
        }
        StudentNode temp = head;
        while(temp!=null){
            System.out.println("Roll Number: " + temp.rollNumber + "\nName: " + temp.name + "\nAge: " + temp.age + "\nGrade: " + temp.grade );
            temp = temp.next;
            System.out.println();
        }


    }

}
