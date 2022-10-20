package api_test;

import java.math.BigDecimal;

/**
 * BigDecimal
 */
public class BigDecimal_Test {
    public static void main(String[] args) {
        double a = 0.1;
        System.out.println(a);
        double b = a + 0.1;
        System.out.println(b);
        double c = a + b;
        System.out.println(c);
        BigDecimal a1 = BigDecimal.valueOf(a);
        BigDecimal b1 = BigDecimal.valueOf(b);
        BigDecimal c1 = a1.add(b1);
        BigDecimal d1 = a1.subtract(b1);
        BigDecimal e1 = a1.multiply(b1);
        BigDecimal f1 = a1.divide(b1);
        System.out.println(c1);
        System.out.println(d1);
        System.out.println(e1);
        System.out.println(f1);
        // 返回double值，而不是BigDEcimal对象
        double rs = c1.doubleValue();
    }
}
