package api_test;

import java.util.Date;

/**
 * System.currentTimeMillis()
 * Date
 */
public class System_currentTimeMillis_Test {
    public static void main(String[] args) {
//        long time = System.currentTimeMillis();
//        System.out.println(time);
        long starttime = System.currentTimeMillis();
        System.out.println(starttime);
        for (int i = 0; i < 10; i++) {
            System.out.print("输出:"+ i + "\t");
        }
        long endtime = System.currentTimeMillis();
        System.out.println((endtime-starttime)/1000.0 + "s");
        System.out.println("-----------------------");
        Date d0 = new Date(starttime);
        System.out.println(d0);
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println(d1.getTime());
    }
}
