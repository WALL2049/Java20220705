package interface_test;

public interface People {
    // public static final可以省略不写，这个是默认的，写了会显示灰色
//    public static final String NAME = "human";
    String NAME = "human";
    // public abstract可以省略不写，这个是默认的，写了会显示灰色
//    public abstract void run();
    void run();
    // JDK 8开始，可以在接口写实例方法，需要default开头，默认public修饰，public可以省略。
    // 其实就是就是普通的实例方法，但是接口中不能直接写实例方法
    // 实例方法需要实现类调用，接口不能直接调用
//    public default void abc(){
    default void eat(){
        System.out.println("人类需要吃饭---");
        // 私有方法只能自己访问
        this.go();
    }
    // JDK 8开始，可以在接口写实例方法，静态方法必须用static修饰，public可以省略，必须使用接口名调用
//    public static void test1(){
    static void test1(){
        System.out.println("学习接口中静态方法的使用，必须使用接口名调用");
    }
    // JDK 1.9开始支持私有方法，必须在接口内部才能被访问
    private void go(){
        System.out.println("开始跑静态方法");
    }
}
class SportPerson implements People{
    @Override
    public void run() {
        System.out.println("run!");
    }

}

class Test{
    public static void main(String[] args) {
        SportPerson s = new SportPerson();
        s.run();
        s.eat();
        People.test1();
        int a = 30;
        int b = 20;
        int max = a > b ? a : b;
        System.out.println(max);
    }
}
