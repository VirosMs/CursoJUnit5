package com.example.seccion4;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

//@Tag("persistence")
//@Tag("mysql")
public class DTagFilterTest {

    @Tag("database")
    @Test
    void test1() {
        System.out.println("DTagFilterTest.test1()");
    }

    @Test
    void test2() {
        System.out.println("DTagFilterTest.test2()");
    }
}
