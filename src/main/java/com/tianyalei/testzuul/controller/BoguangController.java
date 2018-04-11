package com.tianyalei.testzuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuweifeng wrote on 2018/4/11.
 */
@RestController
public class BoguangController {

    @GetMapping
    public String boguang() {
        return "曾经沧海难为水，万里独行伯光兄";
    }
}
