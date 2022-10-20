package it.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumCalc {
    @Test
    public void testCalcNum1(){
        int rs1 = NumCalc.calcSum1();
        Assertions.assertEquals(30, rs1, "calcSum1数据异常");
    }

    @Test
    public void testCalcNum2(){
        NumCalc nc = new NumCalc();
        int rs2 = nc.calcSum2();
        Assertions.assertEquals(60, rs2 ,"calcSum2数据异常");
    }

    @Test
    public void testCalcNum3(){
        NumCalc.calcSum3();
    }

    @Test
    public void testCalcNum4(){
        NumCalc nc = new NumCalc();
        nc.calcSum4();
    }
}
