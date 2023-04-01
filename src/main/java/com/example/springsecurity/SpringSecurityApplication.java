package com.example.springsecurity;

import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringSecurityApplication {
//    @Autowired
//    private TwilioConfig twilioConfig;
//
//    @PostConstruct
//    public void initTwilio(){
//        Twilio.init(twilioConfig.getAccountSid(),twilioConfig.getAuthToken());
//    }
    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

}
