package com.lsh.spring.beanDefinition;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/6/7 9:46 下午
 * @desc ：
 */
@Component
public class MyBeanDefinition implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        BeanDefinition a = beanFactory.getBeanDefinition("a");
//        a.set  //设置BeanDefinition信息
        System.out.println("设置Bena定义信息");

    }

    public static void main(String[] args) {

    }


}
