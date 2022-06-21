package com.zchuber.configuration;

import com.zchuber.MsgProperties;
import com.zchuber.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(MsgService.class)
@EnableConfigurationProperties(MsgProperties.class)
public class MsgAutoConfiguration {

    @Autowired
    private MsgProperties msgProperties;

    @Bean
    @ConditionalOnMissingBean(MsgService.class)
    @ConditionalOnProperty(prefix = "msg", value = "enabled", havingValue = "true")
    public MsgService msgService() {
        MsgService msgService = new MsgService(msgProperties.getUrl(),
        msgProperties.getAccessKeyId(),msgProperties.getAccessKeySecret());
        return msgService;
    }

}
