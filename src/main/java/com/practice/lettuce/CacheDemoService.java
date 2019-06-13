package com.practice.lettuce;

import java.util.List;
import java.util.Map;

/**
 * @author Luo Bao Ding
 * @since 2018/11/7
 */
public interface CacheDemoService {

    String withCacheName(String username, int num);

    List<Object> listResult(String username, int num);

    Map<String, Object> mapResult(String username, int num);

}
