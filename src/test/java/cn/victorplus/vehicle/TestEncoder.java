package cn.victorplus.vehicle;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
public class TestEncoder {


    public static void main(String[] args) {
        String password = "admin";
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(4);
        String enPassword = encoder.encode(password);
        System.out.println(enPassword);
    }
}
