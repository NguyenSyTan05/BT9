package com.mycompany.classtudent;



public class StudentList {
    ArrayList<Student> students = new ArrayList<>();

    public void displayAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student findStudentById(String idToFind) {
        for (Student student : students) {
            if (student.getId().equals(idToFind)) {
                return student;
            }
        }
        return null;
    }

    public boolean deleteStudentById(String idToDelete) {
        Student studentToDelete = findStudentById(idToDelete);
        if (studentToDelete != null) {
            students.remove(studentToDelete);
            return true;
        }
        return false;
    }

    public boolean editStudentById(String idToEdit) {
        Student studentToEdit = findStudentById(idToEdit);
        if (studentToEdit != null) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter new name: ");
            String newName = input.nextLine();
            System.out.print("Enter new age: ");
            int newAge = input.nextInt();
            studentToEdit.setName(newName);
            studentToEdit.setAge(newAge);
            return true;
        }
        return false;
    }
}