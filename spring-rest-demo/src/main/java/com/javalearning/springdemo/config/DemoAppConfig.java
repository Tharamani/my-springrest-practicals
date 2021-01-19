/**
 * 
 */
package com.javalearning.springdemo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 *@author Thara
 *Created date and time : 30 Dec 2020 11:22:17 am
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.javalearning.springdemo")
public class DemoAppConfig {

}
