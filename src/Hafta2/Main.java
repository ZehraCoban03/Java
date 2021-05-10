package Hafta2;

public class Main {
    public static void main(String[] args) {
        User user=new User("yıldız","Baran",534646,56784,"baran34email.com","baran989");
        Student student= new Student("  Ayşe  "," Çakal ",3,5252,"ayse234email.com","aysem","%50",0,"JAVA","Oturum açıldı");
        Instructor instructor=new Instructor("a","e",9,26357287,"asdahskjhemail.com","sgdhskjk","java");


        StudentManager studentManager=new StudentManager();
        studentManager.add(student);
        studentManager.addCourse(student);

        InstructorManager instructorManager= new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.delete(instructor);
















    }
}

