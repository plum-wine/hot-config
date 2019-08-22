package com.hang.server.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ZhangHang
 * @date 2018-01-29 16:33
 * *****************
 * function:
 */
@Data
@Component
@ConfigurationProperties(prefix = "redis")
public class RedisConfig {

    private String host;

    private int port;

    /**
     * 单位 s
     */
    private int timeout;

    private String password;

    private int poolMaxTotal;

    private int poolMaxIdle;

    /**
     * 单位 s
     */
    private int poolMaxWait;

}
