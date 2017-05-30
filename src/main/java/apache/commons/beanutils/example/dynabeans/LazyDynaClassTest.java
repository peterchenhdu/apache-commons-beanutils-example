/*
 * File Name: LazyDynaBean.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月30日
 */
package apache.commons.beanutils.example.dynabeans;

import java.util.TreeMap;

import org.apache.commons.beanutils.DynaBean;
import org.apache.commons.beanutils.LazyDynaBean;
import org.apache.commons.beanutils.LazyDynaClass;
import org.apache.commons.beanutils.MutableDynaClass;
import apache.commons.beanutils.example.pojo.User;

/**
 * 
 * @author    http://www.cnblogs.com/chenpi/
 * @version   2017年5月30日
 */

public class LazyDynaClassTest
{

    public static void main(String[] args)
    {
        MutableDynaClass dynaClass = new LazyDynaClass();    // create DynaClass

        dynaClass.add("amount", java.lang.Integer.class);    // add property
        dynaClass.add("users", User[].class);          // add indexed property
        dynaClass.add("orders", TreeMap.class);   // add mapped property

        DynaBean dynaBean = new LazyDynaBean(dynaClass);
        dynaBean.set("amount_", "s");
        dynaBean.set("amount", "s");//报错，需要为整型
        dynaBean.set("users", 1);//报错，需要维数组
        
        System.out.println(dynaBean.get("amount"));

    }
}
