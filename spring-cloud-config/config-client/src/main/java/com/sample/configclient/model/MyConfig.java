package com.sample.configclient.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * 설정 파일을 읽기 위함
 */
@Data
@ConfigurationProperties("hello")  // Application에 @EnableConfigurationProperties(MyConfig.class) 설정 필요
@RefreshScope
@ToString
public class MyConfig {
    private String name;
}
