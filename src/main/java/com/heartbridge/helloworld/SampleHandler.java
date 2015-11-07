package com.heartbridge.helloworld;

import com.github.heartbridge.fs.annotation.Handler;
import com.github.heartbridge.fs.annotation.RequestMapping;

/**
 * @author GavinCook
 * @since 1.0.0
 **/
@Handler
public class SampleHandler {

    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello, xheart_fs";
    }

}
