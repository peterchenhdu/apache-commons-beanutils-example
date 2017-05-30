/*
 * File Name: LazyDynaBean.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月30日
 */
package apache.commons.beanutils.example.dynabeans;

import org.apache.commons.beanutils.LazyDynaList;
import org.apache.commons.beanutils.WrapDynaBean;

import apache.commons.beanutils.example.pojo.User;

/**
 * 
 * @author http://www.cnblogs.com/chenpi/
 * @version 2017年5月30日
 */

public class LazyDynaListTest
{

    public static void main(String[] args)
    {

        LazyDynaList dynaBean = new LazyDynaList();
        dynaBean.setElementType(User.class);
        
        User u = new User();
        u.setName("hello");

        dynaBean.add(1, u);

        System.out.println(dynaBean.size());
        
        User[] users = (User[])dynaBean.toArray();//转化为数组
        System.out.println(users[1].getName());
        
        WrapDynaBean w = (WrapDynaBean) dynaBean.get(1);
        System.out.println(w.get("name"));
    }
}
