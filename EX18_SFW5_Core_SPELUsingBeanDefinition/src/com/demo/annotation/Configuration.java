package com.demo.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@org.springframework.context.annotation.Configuration
@PropertySource("classpath:app.properties")
@ComponentScan(basePackages="com.demo.annotation")
public class Configuration {

}
