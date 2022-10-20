package array_test;

public class ArrayDemo1 {
    public static void main(String[] args) {
//        静态初始化数组
//        double[] scores = new double[]{60.6, 88.5, 99.7, 67.8, 85.8};
//        double[] scores = {60.6, 88.5, 99.7, 67.8, 85.8};

        double scores[] = {60.6, 88.5, 99.7, 67.8, 85.8};
        int ages[] = {17, 18, 19, 16, 20};
        String names[] = {"andy", "jack", "tony"};


        System.out.println(ages);
        System.out.println(scores);
        System.out.println(names);
        ages[0] = 100;
        System.out.println(ages[0]);
        System.out.println(ages.length);
//        数组遍历
        for (int i = 0; i < ages.length; i++){
            System.out.println(ages[i]);
        }
    }
}
