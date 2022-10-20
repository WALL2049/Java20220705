package interface_test;

/**
 * 类和接口的关系：多实现
 */
public class PingPongMan implements People,Sportman,Law{
    // 这部分就是普通类属性类方法
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 接口方法重写
    @Override
    public void run(){
        System.out.println(this.name+"作为乒乓运动员，可以跑得很快---");
    }

    @Override
    public void practice(){
        System.out.println(this.name+"作为乒乓运动员，需要坚持锻炼");
    }

    @Override
    public void obeyLaw(){
        System.out.println(this.name+"作为乒乓运动员，需要遵守法律");
    }

}
