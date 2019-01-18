package com.juzss.test;

import com.juzss.dao.ItemsDao;
import com.juzss.entity.Items;
import com.juzss.service.ItemsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ItemsTest {

    /**
     * dao层测试代码
     */
    @Test
    public void daoTest(){
        //得到spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //从spring容器中得到所需dao接口的代理对象
        ItemsDao itemsDao = applicationContext.getBean(ItemsDao.class);
        //调用方法
        Items items = itemsDao.findById(1);
        System.out.println(items.getName());
    }


    /**
     * service层测试代码
     */
     @Test
     public void serviceTest(){
         //得到spring容器
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
         //从spring容器中得到所需dao接口的代理对象
         ItemsService itemsService = applicationContext.getBean(ItemsService.class);
         //调用方法
         Items items = itemsService.findById(1);
         System.out.println(items.getName());
     }
}
