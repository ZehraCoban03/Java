package Hafta2;

public class InstructorManager extends UserManager {
    public void add(Instructor instructor) {
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+"Aday eğitmen eklendi.");
    }
    public void delete(Instructor instructor) {
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+" Aday eğitmen silindi .");
    }



}
