package com.tit.week03.day01.singlylinkedlist.studentrecordmanagement;

public class StudentRecordManagement {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning( 07 ,"Aditya" , 21 , "A" );
        list.addAtEnd(18 , "Ankit" ,21 , "A");
        list.addAtPosition(2 , 01 , "Aadarsh" , 21 , "A");

        System.out.println("Diplay all Records:");
        list.displayAllRecords();

        System.out.println("Search by Roll Number:");
        list.searchByRollNumber(17);

        System.out.println("Update Grade");
        list.updateByRollNumber(07 , "A+");

        System.out.println("Delete Record");
        list.deleteByRollNumber(18);

        System.out.println("Updated Records:");
        list.displayAllRecords();
    }
}
