package com.nicholas.insurance.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @ClassName HikariCPDataSourceConfig
 * @Decriptiom TODO
 * @Author ：Nicholas Sun
 * @Date 2019/1/3020:21
 * @Version v1.0
 **/
@Configuration
public class HikariCPDataSourceConfig {

    @Value("${spring.datasource.hikari.jdbc-url}")
    private String url;

    @Value("${spring.datasource.hikari.driver-class-name}")
    private String driverClassName;

    @Value("${spring.datasource.hikari.username}")
    private String username;

    @Value("${spring.datasource.hikari.password}")
    private String password;

    @Value("${spring.datasource.hikari.read-only}")
    private String readOnly;

    @Value("${spring.datasource.hikari.connection-timeout}")
    private String connectionTimeout;

    @Value("${spring.datasource.hikari.idle-timeout}")
    private String idleTimeout;

    @Value("${spring.datasource.hikari.max-lifetime}")
    private String maxLifetime;

    @Value("${spring.datasource.hikari.maximum-pool-size}")
    private String maximumPoolSize;

    @Bean(destroyMethod = "close")
    public DataSource dataSource(){
        HikariConfig hikariConfig = new HikariConfig();

        HikariDataSource hikariDataSource = new HikariDataSource(hikariConfig);

        return hikariDataSource;
    }
}
