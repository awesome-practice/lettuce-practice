package com.practice.lettuce;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Luo Bao Ding
 * @since 2018/11/7
 */
@RestController
public class HelloController {
    private final CacheDemoService cacheDemoService;

    public HelloController(CacheDemoService cacheDemoService) {
        this.cacheDemoService = cacheDemoService;
    }

    @RequestMapping("/withCacheName")
    public String withCacheName(String username, int num) {
        return cacheDemoService.withCacheName(username, num);
    }


    @RequestMapping("/listResult")
    public List<Object> listResult(String username, int num) {
        return cacheDemoService.listResult(username, num);
    }

    @RequestMapping("/mapResult")
    public java.util.Map<String, Object> mapResult(String username, int num) {
        return cacheDemoService.mapResult(username, num);
    }


    @RequestMapping("/all")
    public String all(String username, int num) {
        cacheDemoService.withCacheName(username, num);
        cacheDemoService.listResult(username, num);
        cacheDemoService.mapResult(username, num);
        return "success";
    }


}
