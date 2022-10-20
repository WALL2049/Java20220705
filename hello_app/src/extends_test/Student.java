package extends_test;

/**
 * 子类
 */
public class Student extends People{
    private String classname;
    public String nametest = "子类名";

    public void testfun(){
        String nametest = "局部变量名";
        System.out.println(nametest);
        System.out.println(this.nametest);
        System.out.println(super.nametest);
        study();
    }

    @Override
    public void eat(){
        super.eat();
        System.out.println("学生的饮食应该更注重营养，特别是蛋白质、维生素的摄入");
    }
    public void study(){
        System.out.println(super.getName()+"年龄"+super.getAge()+"岁，属于"+this.classname+"，需要学习");
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }
}
