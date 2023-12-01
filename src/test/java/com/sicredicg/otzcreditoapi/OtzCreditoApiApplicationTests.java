package com.sicredicg.otzcreditoapi;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SpringBootTest
@Slf4j
class OtzCreditoApiApplicationTests {

    @Test
    void contextLoads() {
        List<String> lista1 = new ArrayList<>();
        List<String> lista2 = new ArrayList<>();

        lista1.add("a");
        lista1.add("b");
        lista2.add("c");
        lista2.add("d");
        lista2.add("a");

        if (Collections.disjoint(lista1, lista2)) {
            log.info("rt");
        }else
        {
            log.info("rr");
        }

    }

}
