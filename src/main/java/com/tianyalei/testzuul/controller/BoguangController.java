package com.tianyalei.testzuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuweifeng wrote on 2018/4/11.
 */
@RestController
@RequestMapping({"", "/"})
public class BoguangController {

    @GetMapping
    public String boguang() {
        return "服务器欢迎页";
        //return "海到无边天做岸，降龙既出我为锋。\n" +
        //        "\n" +
        //        "侯门一入深似海，从此萧郎是路人。\n" +
        //        "\n" +
        //        "桃李春风杯中酒，江湖夜雨一盏灯。\n" +
        //        "\n" +
        //        "身无彩凤双飞翼，心有灵犀一点通。\n" +
        //        "\n" +
        //        "玲珑骰子安红豆, 入骨相思知不知。\n" +
        //        "\n" +
        //        "悟能尘世行八戒，终修正果净坛时。\n" +
        //        "\n" +
        //        "仲达更尽一杯酒，何须身后千载名。\n" +
        //        "\n" +
        //        "南朝四百八十寺，缘来智深烟雨中。\n" +
        //        "\n" +
        //        "曾经沧海难为水，万里独行伯光兄。\n" +
        //        "\n" +
        //        "取次花丛懒回顾，半缘修罗半缘君。\n" +
        //        "\n" +
        //        "三生有幸桃花源，七夕今宵看碧霄。\n" +
        //        "\n" +
        //        "鸿雁长飞光不度，鱼龙潜跃水成文。\n" +
        //        "\n" +
        //        "物华天宝谁不见，人杰地灵满乾坤。";
    }
}
