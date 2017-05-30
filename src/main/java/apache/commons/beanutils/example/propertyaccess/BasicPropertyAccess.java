/*
 * File Name: Main.java
 * Description: 
 * Author: http://www.cnblogs.com/chenpi/
 * Create Date: 2017年5月29日
 */
package apache.commons.beanutils.example.propertyaccess;

import java.lang.reflect.InvocationTargetException;

import org.apache.commons.beanutils.PropertyUtils;

import apache.commons.beanutils.example.pojo.Employee;

/**
 * 
 * @author http://www.cnblogs.com/chenpi/
 * @version 2017年5月29日
 */

public class BasicPropertyAccess
{

    /**
     * 
     * 
     * @param args
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */

    public static void main(String[] args)
        throws IllegalAccessException, InvocationTargetException, NoSuchMethodException
    {
        Employee employee = new Employee();
        String firstName = (String) PropertyUtils.getSimpleProperty(employee, "firstName");
        String lastName = (String) PropertyUtils.getSimpleProperty(employee, "lastName");

        firstName = firstName == null ? "Pi" : "";
        lastName = lastName == null ? "Chen" : "";

        PropertyUtils.setSimpleProperty(employee, "firstName", firstName);
        PropertyUtils.setSimpleProperty(employee, "lastName", lastName);

        System.out.println(employee.getFullName());
    }

}
