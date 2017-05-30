/*
 * File Name: MapPropertyAccess.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月29日
 */
package apache.commons.beanutils.example.propertyaccess;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.PropertyUtils;
import apache.commons.beanutils.example.pojo.MappedBean;

/**
 * 
 * @author    http://www.cnblogs.com/chenpi/
 * @version   2017年5月29日
 */

public class MapPropertyAccess
{

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        MappedBean employee = new MappedBean();
        Map<String, Object> map = new HashMap<String, Object>();
        //employee.setMapProperty(map);
        PropertyUtils.setSimpleProperty(employee, "mapProperty", map);
        
        PropertyUtils.setMappedProperty(employee, "mapProperty", "testKey1", "testValue1");
        PropertyUtils.setMappedProperty(employee, "mapProperty(testKey2)", "testValue2");

        System.out.println(employee.getMapProperty().get("testKey1"));
        System.out.println(employee.getMapProperty().get("testKey2"));
       
    }
}
