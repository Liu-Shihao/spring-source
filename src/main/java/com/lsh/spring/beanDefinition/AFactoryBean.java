package com.lsh.spring.beanDefinition;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author ：LiuShihao
 * @date ：Created in 2022/6/7 11:04 下午
 * @desc ：FactoryBean
 * 面试题：BeanFactory 和 FactoryBean的区别？
 * 都是用来创建对象的
 * 当使用BeanFactory的时候必须要遵循完整的创建过程，这个过程是由spring来管理控制的
 * 而使用FactoryBean只需要调用getObject就可以返回具体的对象，整个对象的创建过程是由用户自己来控制的，更加灵活
 */
public class AFactoryBean implements FactoryBean<A> {
    @Override
    public A getObject() throws Exception {
        return new A();
    }

    @Override
    public Class<?> getObjectType() {
        return A.class;
    }
}
