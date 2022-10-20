package loop_test;

public class ForDemo2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i <= 999; i++){
            int a = i / 100;
            int b = (i % 100) / 10;
            int c = ((i % 100) % 10);
            if (a*a*a + b*b*b + c*c*c == i){
                count++;
                System.out.print(i + "\t");
            }
        }
        System.out.println("\n水仙花个数是：" + count);
    }
}
