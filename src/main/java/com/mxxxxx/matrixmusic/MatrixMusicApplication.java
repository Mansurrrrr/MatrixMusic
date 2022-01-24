package com.mxxxxx.matrixmusic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MatrixMusicApplication {

    public static void main(String[] args) {
        SpringApplication.run(MatrixMusicApplication.class, args);
    }

}
