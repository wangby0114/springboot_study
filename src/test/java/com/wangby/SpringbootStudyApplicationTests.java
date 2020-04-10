package com.wangby;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;

@SpringBootTest
class SpringbootStudyApplicationTests {

    @Test
    void contextLoads() {

        System.out.println("******************************");
        String version = SpringVersion.getVersion();
        String version1 = SpringBootVersion.getVersion();

        System.out.println(version + " --- " + version1);
        System.out.println("******************************");
    }

}
