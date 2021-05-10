package Hafta2;

public class Student extends User {
    private String Progress;
    private double pay;
    private String register;


    public Student (String lastName,String firstName,int id,int password,String email,String nickName, String progress,double pay,String register,String login){
        super(lastName,firstName,id,password,email,nickName);
        this.Progress=progress;
        this.pay=pay;
        this.register=register;

    }

    public String getProgress() {
        return Progress;
    }

    public void setProgress(String progress) {
        Progress = progress;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }


}






