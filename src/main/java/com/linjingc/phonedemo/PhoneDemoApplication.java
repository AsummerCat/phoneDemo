package com.linjingc.phonedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PhoneDemoApplication {

    public static void main(String[] args) {

        boolean check = LibPhoneNumberUtil.doValid("13003808787");
         System.out.println(check?"校验成功":"校验失败");
        SpringApplication.run(PhoneDemoApplication.class, args);
    }

}
