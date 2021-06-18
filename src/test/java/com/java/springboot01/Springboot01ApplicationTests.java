package com.java.springboot01;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot01ApplicationTests {

    @Test
    void contextLoads() {
    }

    String[] list ={"001","002","003"};

    public StringBuffer check(String[] list, StringBuffer stringbuffer) {
        boolean flag = false;
        for (String item : list) {
            if (flag) {
                stringbuffer.append(",");
            } else {
                flag = true;
            }
            stringbuffer.append(item);
        }
        return stringbuffer;
    }

    @Test
    public void test(){
        StringBuffer s = new StringBuffer();
        StringBuffer stringBuffer = check(list,s);
        System.out.println(stringBuffer);
    }
}
