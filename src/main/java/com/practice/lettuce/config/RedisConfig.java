package com.practice.lettuce.config;

import com.practice.lettuce.config.customizer.LettuceClientRedisClusterCustomizer;
import org.springframework.boot.autoconfigure.data.redis.LettuceClientConfigurationBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Luo Bao Ding
 * @since 2018/11/7
 */
@Configuration
public class RedisConfig {

    @Bean
    public LettuceClientConfigurationBuilderCustomizer lettuceClientRedisClusterCustomizer() {
        return new LettuceClientRedisClusterCustomizer();
    }


//    @Autowired
//    public void customLettuceConnectionFactory(LettuceConnectionFactory lettuceConnectionFactory) {
//        lettuceConnectionFactory.setShareNativeConnection(false);//lkm
//    }

}
