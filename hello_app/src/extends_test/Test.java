package extends_test;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student();
        Teacher t1 = new Teacher();

        s1.setName("小明");
        s1.setAge(13);
        s1.setClassname("初一13班");
        t1.setDepartmentName("语文组");
        t1.setName("李老师");
        t1.setAge(30);
        System.out.println(s1.getName());
        System.out.println(s1.getClassname());
        System.out.println(t1.getAge());
        System.out.println(t1.getDepartmentName());
        s1.study();
        t1.teach();

        s1.testfun();
        s1.eat();




    }
}
