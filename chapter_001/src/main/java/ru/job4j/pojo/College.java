package ru.job4j.pojo;
public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullname("Ivan Ivanovich Ivanov ");
        student.setGroup("Intern");
        student.setAdmission("25.12.2019");
        System.out.print(student.getFullname() + "is studying in the group " + student.getGroup() + " from " + student.getAdmission());
    }
}
