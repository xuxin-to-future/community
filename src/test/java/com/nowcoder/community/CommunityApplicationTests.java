package com.nowcoder.community;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class)
class CommunityApplicationTests {



    private Logger logger = LoggerFactory.getLogger(CommunityApplicationTests.class);
    @Test
    void contextLoads() {
    }

    @Test
    void testLogger() {
        System.out.println(logger.getName());
        logger.debug("logging debug");
        logger.warn("logging warn");
        logger.error("logging error");
    }
}
