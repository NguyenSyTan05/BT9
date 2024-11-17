/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.classtudent;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {

    String studentId;
    String fullName;
    String dateOfBirth;
    String major;
    float gpa;

    Student(String studentId, String fullName, String dateOfBirth, String major, float gpa) {
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.studentId = studentId;
        this.major = major;
        this.gpa = gpa;
    }

    public void enterStudentInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap id hoc sinh: ");
        studentId = sc.nextLine();
        System.out.print("Nhap ten hoc sinh: ");
        fullName = sc.nextLine();
        System.out.print("Nhap nam sinh (dd/MM/yyyy): ");
        dateOfBirth = sc.nextLine();
        System.out.print("Nhap Nganh: ");
        major = sc.nextLine();
        System.out.print("Nhap diem tb:  ");
        gpa = sc.nextFloat();
        sc.close();
    }

    public void displayStudentInfo() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = null;
        try {
            date = dateFormat.parse(dateOfBirth);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Id hoc sinh: " + studentId);
        System.out.println("Ten hoc sinh: " + fullName);
        System.out.println("Nam sinh: " + (date != null ? dateFormat.format(date) : "Ngay khong hop le"));
        System.out.println("Nganh: " + major);
        System.out.println("Diem tb: " + gpa);
    }
}