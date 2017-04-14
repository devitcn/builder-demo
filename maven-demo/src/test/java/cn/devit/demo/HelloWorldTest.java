package cn.devit.demo;

import static org.junit.Assert.*;

import org.junit.Test;

import cn.devit.demo.HelloWorld;

public class HelloWorldTest {

    @Test
    public void 一加一等于二() throws Exception {
        assertEquals(2, HelloWorld.plus(1, 1));
    }
}
