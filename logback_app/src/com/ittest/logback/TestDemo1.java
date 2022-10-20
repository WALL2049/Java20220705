package com.ittest.logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestDemo1 {
    public static final Logger LOGGER = LoggerFactory.getLogger("TestDemo1.class");
    public static void main(String[] args) {
        try {
            LOGGER.debug("main方法开始执行~~~");
            LOGGER.info("开始执行第二行代码，准备做除法");
            int a = 5;
            int b = 10;
            LOGGER.trace("a=" + a);
            LOGGER.trace("b=" + b);
            System.out.println(a/b);
        } catch (Exception e) {
//            throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
}
