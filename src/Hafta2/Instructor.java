package Hafta2;

public class Instructor extends User {
     String profession;

    public Instructor(String lastName, String firstName, int id, int password, String email, String nickName, String profession) {
        super(lastName, firstName, id, password, email, nickName);
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}


