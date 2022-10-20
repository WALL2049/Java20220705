package extends_test;

/**
 * 父类
 */
public class People {
    private String name;
    public String nametest="父类名";
    private int age;

    public void eat(){
        System.out.println("人需要吃饭");
    }

    public void checkSchedul(){
        System.out.println(this.name + "查看课表");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
