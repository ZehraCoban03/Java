package Hafta2;

public class User {
    private String firstName;
    private String lastName;
    private int id;
    private int password;
    private String email;
    private String nickName;


    public User(String firstName, String lastName, int id, int password, String email, String nickName) {
        super();
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
        this.password = password;
        this.email = email;
        this.nickName = nickName;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }



    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
