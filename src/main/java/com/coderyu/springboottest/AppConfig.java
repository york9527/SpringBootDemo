/*
package com.coderyu.springboottest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import org.springframework.context.annotation.Configuration;
import org.springframework.validation.annotation.Validated;

@Configuration
@ConfigurationProperties(prefix = "jdbc")
@Validated
public class AppConfig {
    @Value("driver")
    private String driver;

    @Value("url")
    private String url;

    @Value("username")
    private String username;

    @Value("password")
    private String password;

    @Value("#{new Integer(${jdbc.count})}")
    private Integer count;

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getMaxThreadCount() {
        return count;
    }

    public void setMaxThreadCount(Integer maxThreadCount) {
        this.count = maxThreadCount;
    }
}*/
