package com.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.FilterType;

@org.springframework.context.annotation.Configuration
@ComponentScan(basePackages = "com.annotation.demo", 
excludeFilters=@Filter(type=FilterType.REGEX,pattern=".*Service"))
public class Configuration {

}
