package constructor;

public class Student {
    private String name;
    private String gender;
    private int number;
    private double height;
    private int age;

    public Student(){}

    public Student(String name, String gender, int number, double height, int age){
        this.name = name;
        this.gender = gender;
        this.number = number;
        this.height = height;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public String getGender(){
        return this.gender;
    }
    public int getNumber(){
        return this.number;
    }
    public double getHeight() {
        return this.height;
    }
    public int getAge(){
        return this.age;
    }
}
