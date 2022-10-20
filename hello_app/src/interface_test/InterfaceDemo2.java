package interface_test;

/**
 * 接口多继承到一个接口后，单实现该接口即可
 */
public class InterfaceDemo2 implements TestInterface {
    @Override
    public void run() {
        System.out.println("运动员可以跑得很快---");
    }

    @Override
    public void practice() {
        System.out.println("运动员需要坚持锻炼");
    }

    @Override
    public void obeyLaw() {
        System.out.println("运动员需要遵守法律");
    }
}
