package com.zchuber;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "msg")
public class MsgProperties {

    private String url;
    private String accessKeyId;
    private String accessKeySecret;


}
