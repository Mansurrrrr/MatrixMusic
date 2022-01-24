package com.mxxxxx.matrixmusic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * MainController
 *
 * @author Mansur
 * @date 2022/1/24 11:31
 */
@RestController
@RequestMapping
public class MainController {

    @RequestMapping("/")
    public String main() {
        return "Hello World";
    }
}
