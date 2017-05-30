/*
 * File Name: CustomConverters.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月30日
 */
package apache.commons.beanutils.example.utils;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;

import apache.commons.beanutils.example.pojo.User;

/**
 * 
 * @author    http://www.cnblogs.com/chenpi/
 * @version   2017年5月30日
 */

public class CustomConverters
{

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException
    {
        ConvertUtils.register(new StringConverter(), String.class);
        
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "001");
        map.put("address", "hz");
        map.put("id", "100");
        map.put("state", "false");
        
        
        User u = new User();
        BeanUtils.populate(u, map);
        
        System.out.println(u);
    }
}

class StringConverter implements Converter {  
    /**
     * 
     * 
     * @see org.apache.commons.beanutils.Converter#convert(java.lang.Class, java.lang.Object)
     * @param type
     * @param value
     * @return
     */
    @SuppressWarnings("unchecked")
    @Override
    public <T> T convert(Class<T> type, Object value)
    {

        if(String.class.isInstance(value)){
            return (T) ("###" + value);
        }else{
            return (T) value;
        }
        
    }  
}