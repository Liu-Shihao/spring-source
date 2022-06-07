package com.lsh.spring.beanDefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/6/7 10:01 下午
 * @desc ：Aware 感知、察觉、注意到
 *
 */
public class A implements ApplicationContextAware, EnvironmentAware, BeanNameAware {

    private String name;
    private String beanName;
    private ApplicationContext applicationContext;
    private Environment environment;

    public void init(){
        System.out.println("init");
        System.out.println(this.name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }



    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public String getBeanName() {
        return beanName;
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    @Override
    public void setBeanName(String name) {
        this.beanName = name;
    }
}
