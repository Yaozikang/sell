package com.imooc.sell;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SellApplicationTests {

    private final Logger logger = LoggerFactory.getLogger(SellApplication.class);

    @Test
    public void contextLoads() {
        logger.debug("debug...");
        logger.error("error...");
        logger.info("info...");
    }

}
