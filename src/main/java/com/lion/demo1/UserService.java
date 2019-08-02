package com.lion.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Spring的Bean管理的注解方式：
 *  传统方式需要去XML中配置<bean id="" class=""></bean>
 *  现在只需在类前加入注解
 */
@Component("userService")
public class UserService {

    @Value("米饭")
    private String something;

//    @Autowired
//    @Qualifier("userDao")
    // @Resource 相当于上面两个注解
    @Resource(name="userDao")
    private UserDao userDao;

    public String sayHello(String name) {
        return "hello" + name;
    }

    public void eat() {
        System.out.println("eat" + something);
    }

    public void save() {
        System.out.println("Service中保存用户的方法");
        userDao.save();
    }
}
