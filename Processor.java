
package com.mycompany.classtudent;

import java.util.Scanner;



public class Processor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Nhap thong tin hoc sinh");
        System.out.println("2. Hien thi thong tin tat ca hoc sinh");
        System.out.println("3. Tim kiem hoc sinh theo id");
        System.out.println("4. Xoa hoc sinh theo id");
        System.out.println("5. Thoat");
        System.out.println("Chon chuc nang: ");
        int choice = sc.nextInt();
        StudentList studentList = new StudentList();
        while(choice != 5)
        {
            switch(choice)
            {
                case 1:
                    studentList.enteraddStudent();
                    break;
                case 2:
                    studentList.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Nhap id hoc sinh can tim: ");
                    String idToFind = sc.nextLine();
                    String fullName = studentList.findStudentById(idToFind);
                    if(fullName != null)
                    {
                        System.out.println("Ten hoc sinh: " + fullName);
                    }
                    else
                    {
                        System.out.println("Khong tim thay hoc sinh");
                    }
                    break;
                default:
                    System.out.println("Chuc nang khong hop le");
                    break;
            }
            System.out.println("1. Nhap thong tin hoc sinh");
            System.out.println("2. Hien thi thong tin tat ca hoc sinh");
            System.out.println("3. Tim kiem hoc sinh theo id");
            System.out.println("4. Xoa hoc sinh theo id");
            System.out.println("5. Thoat");
            System.out.println("Chon chuc nang: ");
            choice = sc.nextInt();
        }
        sc.close();
    }

}
