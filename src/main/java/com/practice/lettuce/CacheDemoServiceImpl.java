package com.practice.lettuce;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Luo Bao Ding
 * @since 2018/11/7
 */
@Service
public class CacheDemoServiceImpl implements CacheDemoService {

    @Cacheable("withCacheName")
    @Override
    public String withCacheName(String username, int num) {
        return "withCacheName " + username + " " + num;
    }

    @Cacheable("listResult")
    @Override
    public List<Object> listResult(String username, int num) {
        List<Object> list = new ArrayList<>(2);
        list.add(username);
        list.add(num);
        return list;
    }

    @Cacheable("mapResult")
    @Override
    public Map<String, Object> mapResult(String username, int num) {
        Map<String, Object> map = new HashMap<>(2);
        map.put("username", username);
        map.put("num", num);
        return map;
    }

}
