package loop_test;

public class ForDemo1 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("HelloWorld");
        }
        System.out.println("------------------------");
        for (int i = 1; i <= 5; i+=2) {
            System.out.println("HWorld");
        }
        System.out.println("------------------------");
        int sum = 0;
        for (int i = 1; i < 101; i++){
            sum += i;
        }
        System.out.println("1到100的和是:" + sum);
        System.out.println("------------------------");
        int sum1 = 0;
//      for (int i = 1; i < 101; i += 2){
//            sum1 += i;
//      }
        for (int i = 1; i < 101; i++){
            if (i % 2 == 1){
                sum1 += i;
            }
        }
        System.out.println("1到100中奇数的和是:" + sum1);

    }
}
