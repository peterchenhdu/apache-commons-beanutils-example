/*
 * File Name: CollectionUtilsTest.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月30日
 */
package apache.commons.beanutils.example.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.beanutils.BeanPropertyValueChangeClosure;
import org.apache.commons.beanutils.BeanPropertyValueEqualsPredicate;
import org.apache.commons.beanutils.BeanToPropertyValueTransformer;
import org.apache.commons.collections.CollectionUtils;

import apache.commons.beanutils.example.pojo.User;

/**
 * 
 * @author http://www.cnblogs.com/chenpi/
 * @version 2017年5月30日
 */

public class CollectionUtilsTest
{

    public static void main(String[] args)
    {
        List<User> userList = new ArrayList<User>();
        User u1 = new User();
        u1.setId(1l);
        u1.setName("chenpi1");
        u1.setState(true);
        User u2 = new User();
        u2.setId(2l);
        u2.setName("chenpi2");
        User u3 = new User();
        u2.setId(3l);
        u2.setName("chenpi3");
        u2.setState(true);
        userList.add(u1);
        userList.add(u2);
        userList.add(u3);

        //批量修改集合
        BeanPropertyValueChangeClosure closure = new BeanPropertyValueChangeClosure("name",
            "updateName");

        CollectionUtils.forAllDo(userList, closure);

        for (User tmp : userList)
        {
            System.out.println(tmp.getName());
        }
        
        BeanPropertyValueEqualsPredicate predicate =
            new BeanPropertyValueEqualsPredicate( "state", Boolean.TRUE );

        //过滤集合
        CollectionUtils.filter( userList, predicate );
        for (User tmp : userList)
        {
            System.out.println(tmp);
        }
        
        //创建transformer
        BeanToPropertyValueTransformer transformer = new BeanToPropertyValueTransformer( "id" );

        //将集合中所有你user的id传输到另外一个集合上
        Collection<?> idList = CollectionUtils.collect( userList, transformer );
        for (Object id : idList)
        {
            System.out.println(id);
        }


    }
}
