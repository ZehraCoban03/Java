package Hafta2;

public class StudentManager extends UserManager {


    public void add(Student student) {
        System.out.println(student.getFirstName() + student.getLastName() + " eklendi.");

    }
    public void delete(Student student) {
        System.out.println(student.getFirstName()+student.getLastName()+" Silindi.");
    }
    public void addCourse(Student student) {
        System.out.println(student.getRegister()+" Eğtimi "+student.getFirstName()+" isimli kişiye eklendi.");
    }
}
