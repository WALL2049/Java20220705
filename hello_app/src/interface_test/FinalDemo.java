package interface_test;

public class FinalDemo {
    public static final String CLASS_NAME = "classname";
    public static void test1(){
        final int VSITOR_NUM = 0;
        // 下面这种写法有误，方法里面不能再声明public static
//        public static final int AGE = 18;
        final int AGE = 18;
    }

}
