package array_test;


/**
 *        动态初始化数组
 */
public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] ages = new int[5];
        ages[0] = 16;
        System.out.println(ages[0]);
        System.out.println(ages[1]);

        String[] names = new String[5];
        names[0] = "andy";
        System.out.println(names[0]);
        System.out.println(names[1]);
    }
}
