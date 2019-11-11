package com.imooc.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author 要子康
 * @description ProjectUrl
 * @since 2019/11/11 10:46
 */
@Data
@ConfigurationProperties(prefix = "projectUrl")
@Component
public class ProjectUrlConfig {

    /**
     * 微信公众号授权url
     */
    public String wechatMpAutorize;

    /**
     * 微信开放平台授权url
     */
    public String wechatOpenAutorize;

    /**
     * 点餐系统
     */
    public String sell;
}
