package inner_anonymous_test;

/**
 * 好好看好好学，匿名内部类
 */
public class TestDemo1 {
    public static void main(String[] args) {
        // 普通调用类
        Swimming s1 = new Student();
        go(s1);
        // 匿名内部类，省去定义Teacher类
        Swimming s2 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师自由泳，游得很棒");
            }
        };
        go(s2);
        // 直接放到入参里面，省去s
        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("运动员自由泳，也太快了吧！");
            }
        });
        // lambda表达式
        go( () -> {
            System.out.println("用lambda表达式描述游泳");
        });
        // 简化lambda
        go( () -> System.out.println("用简化lambda表达式描述游泳"));
    }

    public static void go(Swimming s){
        System.out.println("比赛开始");
        s.swim();
        System.out.println("比赛结束");
        System.out.println("----------------------");
    }
}
class Student implements Swimming{

    @Override
    public void swim() {
        System.out.println("学生自由泳，游得不错");
    }
}

@FunctionalInterface
interface Swimming{
    public void swim();
}
