package com.practice.lettuce.config.customizer;

import io.lettuce.core.ReadFrom;
import io.lettuce.core.TimeoutOptions;
import io.lettuce.core.cluster.ClusterClientOptions;
import io.lettuce.core.cluster.ClusterTopologyRefreshOptions;
import org.springframework.boot.autoconfigure.data.redis.LettuceClientConfigurationBuilderCustomizer;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;

import java.time.Duration;

/**
 * @author Luo Bao Ding
 * @since 2018/11/7
 */
public class LettuceClientRedisClusterCustomizer  implements LettuceClientConfigurationBuilderCustomizer {
    @Override
    public void customize(LettuceClientConfiguration.LettuceClientConfigurationBuilder clientConfigurationBuilder) {
        ClusterTopologyRefreshOptions topologyRefreshOptions = ClusterTopologyRefreshOptions.builder()
//                .enablePeriodicRefresh(Duration.ofMillis(2000))//lkm: could  be disabled
                .enableAllAdaptiveRefreshTriggers()
                .build();
        ClusterClientOptions clusterClientOptions = ClusterClientOptions.builder()
                .topologyRefreshOptions(topologyRefreshOptions)
                .validateClusterNodeMembership(false)//lkm: may by should set true
                .build();
        clientConfigurationBuilder.clientOptions(clusterClientOptions)
                .readFrom(ReadFrom.SLAVE_PREFERRED)
        ;
    }
}
