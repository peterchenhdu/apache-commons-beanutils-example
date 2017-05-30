/*
 * File Name: BeanUtilsTest.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月30日
 */
package apache.commons.beanutils.example.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

import apache.commons.beanutils.example.pojo.User;

/**
 * 
 * @author    http://www.cnblogs.com/chenpi/
 * @version   2017年5月30日
 */

public class BeanUtilsTest
{

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException
    {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "001");
        //map.put("address", "hz");
        map.put("id", "100");
        map.put("state", false);
        map.put("others", "others");
        
        
        User u = new User();
        BeanUtils.populate(u, map);
        
        System.out.println(u);
        
        
        User u1 = new User();
        BeanUtils.copyProperties(u1, u);
        System.out.println(u1);
    }
}
